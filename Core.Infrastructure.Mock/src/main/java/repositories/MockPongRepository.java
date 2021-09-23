package repositories;

import entities.Ping;
import entities.Pong;
import org.springframework.stereotype.Repository;
import repositoryInterfaces.IPongRepository;

import java.util.ArrayList;

@Repository("pongRepository")
public class MockPongRepository implements IPongRepository {

    public Pong GetById(Long id) {
        var pong = new Pong(1L);
        pong.addPing(new Ping(1L));
        return pong;
    }

    public Long CreatePong(Pong pong) {
        return 1L;
    }

    public Iterable<Pong> GetAll() {
        var pongs = new ArrayList<Pong>();
        pongs.add(new Pong(1L));
        pongs.add(new Pong(2L));
        pongs.add(new Pong(3L));
        return pongs;
    }

    public void Delete(Pong pong) { }
}
