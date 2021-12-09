package com.xdlr.infosys.model;

import javax.persistence.Entity;

@Entity
public class LeaveInfo extends MyModel{

    private Integer senderId;
    private String senderName;
    private String sendTime;
    private Integer receiverId;
    private String receiverName;
    private Boolean readed = false;

    public String getSendTime() {
        return sendTime;
    }

    public LeaveInfo(Integer senderId, String senderName, String sendTime, Integer receiverId, String receiverName, boolean readed) {
        this.senderId = senderId;
        this.senderName = senderName;
        this.sendTime = sendTime;
        this.receiverId = receiverId;
        this.receiverName = receiverName;
        this.readed = readed;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public boolean isRead() {
        return readed;
    }

    public void setRead(boolean readed) {
        this.readed = readed;
    }

    public LeaveInfo(){}

    public Integer getSenderId() {
        return senderId;
    }

    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public Integer getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Integer receiverId) {
        this.receiverId = receiverId;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }
}
