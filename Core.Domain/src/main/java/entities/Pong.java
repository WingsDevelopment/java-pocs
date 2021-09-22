package entities;

import java.util.ArrayList;
import java.util.List;

public class Pong {
    private Long id;
    private String value;
    private List<Ping> pairs;
    private Short pingPongTableId;

    public Pong() {

    }

    public Pong(Long id) {
        this.id = id;
    }

    public void addPing(Ping ping) {
        if (pairs == null) {
            pairs = new ArrayList<Ping>();
        }
        if (ping == null) {
            throw new IllegalArgumentException("Ping can't be null");
        }
        pairs.add(ping);
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

    public List<Ping> getPairs() {
        return pairs;
    }

    public void setPairs(List<Ping> pairs) {
        this.pairs = pairs;
    }

    public Short getPingPongTableId() {
        return pingPongTableId;
    }

    public void setPingPongTableId(Short pingPongTableId) {
        this.pingPongTableId = pingPongTableId;
    }
}
