package com.xdlr.infosys.model;

import javax.persistence.Entity;

@Entity
public class Message extends MyModel{

    private Long senderId;
    private String senderName;
    private String sendTime;
    private String type;
    private Long receiverId;
    private String receiverName;
    private Boolean readed = false;

    public String getSendTime() {
        return sendTime;
    }

    public Message(Long senderId, String senderName, String sendTime, String type, Long receiverId, String receiverName, boolean readed) {
        this.senderId = senderId;
        this.senderName = senderName;
        this.sendTime = sendTime;
        this.type = type;
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
