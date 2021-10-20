package com.xdlr.infosys.model;

import javax.persistence.Entity;

@Entity
public class M extends MyModel{

    private Long senderId;
    private String senderName;
    private String sendTime;
    private String type;
    private Long receiverId;
    private String receiverName;
    private Boolean read = false;

    public String getSendTime() {
        return sendTime;
    }

    public M(Long senderId, String senderName, String sendTime, String type, Long receiverId, String receiverName, boolean read) {
        this.senderId = senderId;
        this.senderName = senderName;
        this.sendTime = sendTime;
        this.type = type;
        this.receiverId = receiverId;
        this.receiverName = receiverName;
        this.read = read;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public M(){}

    public Long getSenderId() {
        return senderId;
    }

    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }
}
