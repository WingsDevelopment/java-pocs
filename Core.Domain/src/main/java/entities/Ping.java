package entities;

import java.util.List;

public class Ping {
    private Long id;
    private String value;
    private List<Pong> pairs;
    private Short pingPongTableId;

    public Ping() {
    }

    public Ping(Long id) {
        this.id = id;
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

    public List<Pong> getPairs() {
        return pairs;
    }

    public void setPairs(List<Pong> pairs) {
        this.pairs = pairs;
    }

    public Short getPingPongTableId() {
        return pingPongTableId;
    }

    public void setPingPongTableId(Short pingPongTableId) {
        this.pingPongTableId = pingPongTableId;
    }
}
