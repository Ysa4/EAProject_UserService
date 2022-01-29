package com.jobSearch.userservice.util;

public class Message {


    private MessageStatus status;
    private String message;
    private Object data;

    public Message(){}

    public Message(MessageStatus status , String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public Message(String message, Object data) {
        this.status = MessageStatus.OK;
        this.message = message;
        this.data = data;
    }

    public MessageStatus getStatus() {
        return status;
    }

    public void setStatus(MessageStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData( Object data) {
        this.data = data;
    }
}
