package com.xdlr.infosys.model;

import javax.persistence.Entity;

@Entity
public class Manage extends MyModel{

    private Integer employeeId;
    private String employeeName;
    private Integer managerId;
    private String managerName;

    public Manage(){}
    public Manage(Integer employeeId, String employeeName,Integer managerId, String managerName){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.managerId = managerId;
        this.managerName = managerName;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
}
