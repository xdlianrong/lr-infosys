package com.xdlr.infosys.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Manage extends MyModel{

    private Long employeeId;
    private String employeeName;
    private Long managerId;
    private String managerName;

    public Manage(){}
    public Manage(Long employeeId, String employeeName,Long managerId, String managerName){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.managerId = managerId;
        this.managerName = managerName;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Long getManagerId() {
        return managerId;
    }

    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
}
