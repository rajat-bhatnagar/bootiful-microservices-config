package com.thoughtworks.springboot.data;

public class Message {
    private String globalMessage;
    private String localMessage;

    public Message(String globalMessage, String localMessage) {
        this.globalMessage = globalMessage;
        this.localMessage = localMessage;
    }

    public String getGlobalMessage() {
        return globalMessage;
    }

    public void setGlobalMessage(String globalMessage) {
        this.globalMessage = globalMessage;
    }

    public String getLocalMessage() {
        return localMessage;
    }

    public void setLocalMessage(String localMessage) {
        this.localMessage = localMessage;
    }


}
