package com.xdlr.infosys.repo;

import com.xdlr.infosys.model.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message,Integer> {
    List<Message> findByReaded(Boolean readed);
}
