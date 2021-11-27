package com.xdlr.infosys.model;

public class CEO extends MyModel{

    private Long ManageId;
    private String ManageName;
    private Long CEOId;
    private String CEOName;

    public Long getManageId() {
        return ManageId;
    }

    public void setManageId(Long manageId) {
        ManageId = manageId;
    }

    public String getManageName() {
        return ManageName;
    }

    public void setManageName(String manageName) {
        ManageName = manageName;
    }

    public Long getCEOId() {
        return CEOId;
    }

    public void setCEOId(Long CEOId) {
        this.CEOId = CEOId;
    }

    public String getCEOName() {
        return CEOName;
    }

    public void setCEOName(String CEOName) {
        this.CEOName = CEOName;
    }
}
