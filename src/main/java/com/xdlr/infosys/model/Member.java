package com.xdlr.infosys.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Member extends MyModel{
    private String name;
    private String password;
    private String identityNumber;
    private String phone;
    private String email;
    private String sex;
    private String department;
    private String position;
    private LocalDate birthday;
    private LocalDate entryTime;
    private LocalDate resignationTime;
    @JsonIgnoreProperties(value = {"roles"})
    @JoinTable(
            name = "member_roles",
            joinColumns =
            @JoinColumn(name = "member_id", referencedColumnName = "id"),
            inverseJoinColumns =
            @JoinColumn(name = "role_id", referencedColumnName = "id")
    )
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Role> roles = new HashSet<>();

    public Member() {}

    public Member(String name, String email, String password, String identityNumber, String phone, String sex, String department, String position, LocalDate birthday, LocalDate entryTime) {
        this.name = name;
        this.password = password;
        this.identityNumber = identityNumber;
        this.phone = phone;
        this.sex = sex;
        this.department = department;
        this.position = position;
        this.birthday = birthday;
        this.entryTime = entryTime;
        this.email = email;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public LocalDate getEntryTime() {
        return entryTime;
    }

    public LocalDate getResignationTime() {
        return resignationTime;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public String getPhone() {
        return phone;
    }

    public String getSex() {
        return sex;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setEntryTime(LocalDate entryTime) {
        this.entryTime = entryTime;
    }

    public void setResignationTime(LocalDate resignationTime) {
        this.resignationTime = resignationTime;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public void addRole(Role role){
        roles.add(role);
    }

    public void removeRole(Role role){
        roles.remove(role);
    }
}
