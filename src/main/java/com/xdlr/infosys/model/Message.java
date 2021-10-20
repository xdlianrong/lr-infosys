package com.xdlr.infosys.model;

import javax.persistence.Entity;

@Entity
public class Message extends MyModel{

    private Long senderId;
    private String senderName;
    private String sendTime;
    private String type;
    private Long recieverId;
    private String recieverName;
    private boolean read = false;

    public String getSendTime() {
        return sendTime;
    }

    public Message(Long senderId, String senderName, String sendTime, String type, Long recieverId, String recieverName, boolean read) {
        this.senderId = senderId;
        this.senderName = senderName;
        this.sendTime = sendTime;
        this.type = type;
        this.recieverId = recieverId;
        this.recieverName = recieverName;
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

    public Message(){}

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

    public Long getRecieverId() {
        return recieverId;
    }

    public void setRecieverId(Long recieverId) {
        this.recieverId = recieverId;
    }

    public String getRecieverName() {
        return recieverName;
    }

    public void setRecieverName(String recieverName) {
        this.recieverName = recieverName;
    }
}
