package entities;

import java.util.List;

public class PingPongTable {
    private Short id;

    private List<Ping> pings;
    private List<Pong> pongs;

    public PingPongTable() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public List<Ping> getPings() {
        return pings;
    }

    public void setPings(List<Ping> pings) {
        this.pings = pings;
    }

    public List<Pong> getPongs() {
        return pongs;
    }

    public void setPongs(List<Pong> pongs) {
        this.pongs = pongs;
    }
}
