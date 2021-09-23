package com.example.webclient.models;

import entities.Pong;

import java.io.Serializable;

public class PongVM implements Serializable {
    private Long id;
    private String value;
    private Short pingPongTableId;

    public PongVM() {
    }

    public PongVM(Pong pong) {
        this.id = pong.getId();
        this.value = pong.getValue();
    }

    public Short getPingPongTableId() {
        return pingPongTableId;
    }

    public void setPingPongTableId(Short pingPongTableId) {
        this.pingPongTableId = pingPongTableId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
