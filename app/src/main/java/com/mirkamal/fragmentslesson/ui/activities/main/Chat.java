package com.mirkamal.fragmentslesson.ui.activities.main;

public class Chat {

    private String senderName, message, time;

    public Chat(String senderName, String message, String time) {
        this.senderName = senderName;
        this.message = message;
        this.time = time;
    }

    public String getSenderName() {
        return senderName;
    }

    public String getMessage() {
        return message;
    }

    public String getTime() {
        return time;
    }
}
