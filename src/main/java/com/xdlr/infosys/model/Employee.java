package com.xdlr.infosys.model;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Employee extends MyModel{
    private String name;
    private String password;
    private String idCardNumber;
    private String phone;
    private String sex;
    private String job;
    private String department;
    private String position;
    private LocalDate birthday;
    private LocalDate entryTime;
    private LocalDate resignationTime;

    public Employee() {}

    public Employee(String name, String password, String idCardNumber, String phone, String sex, String job, String department, String position, LocalDate birthday, LocalDate entryTime) {
        this.name = name;
        this.password = password;
        this.idCardNumber = idCardNumber;
        this.phone = phone;
        this.sex = sex;
        this.job = job;
        this.department = department;
        this.position = position;
        this.birthday = birthday;
        this.entryTime = entryTime;
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

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public String getPhone() {
        return phone;
    }

    public String getSex() {
        return sex;
    }

    public String getJob() {
        return job;
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
}
