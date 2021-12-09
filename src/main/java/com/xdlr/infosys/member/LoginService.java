package com.xdlr.infosys.member;

import com.xdlr.infosys.model.Member;
import com.xdlr.infosys.model.Permission;
import com.xdlr.infosys.model.Role;
import com.xdlr.infosys.repo.MemberRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LoginService implements UserDetailsService {
    @Autowired
    PasswordEncoder passwordEncoder;
    Logger logger = LoggerFactory.getLogger(LoginService.class);
    @Autowired
    MemberRepository memberRepository;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        logger.debug("自定义的登录逻辑运行");
        int id = Integer.parseInt(s);
        Member member = memberRepository.findFirstByIdAndIsDeleted(id, false);
        if(member == null){
            throw new UsernameNotFoundException("用户不存在");
        }
        return User.withUsername(member.getName())
                .password(member.getPassword())
                .authorities(findPermissionByName(member).toArray(new String[]{}))
                .build();

    }

    public List<String> findPermissionByName(Member member) {
        return member.getRoles()
                .stream()
                .map(Role::getPermissions)
                .flatMap(Collection::stream)
                .map(Permission::getName)
                .distinct()
                .collect(Collectors.toList());
    }
}
