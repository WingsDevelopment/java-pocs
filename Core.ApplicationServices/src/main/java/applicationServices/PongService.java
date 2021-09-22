package applicationServices;

import entities.Ping;
import entities.Pong;
import interfaces.IPongService;
import repositoryInterfaces.IPongRepository;

public class PongService implements IPongService {
    private final IPongRepository pongRepository;

    public PongService(IPongRepository pongRepository) {
        this.pongRepository = pongRepository;
    }

    public Ping Pong(Long pongId) {
        var pong = pongRepository.GetById(pongId);
        return pong.getPairs().get(0);
    }

    public Pong GetById(Long id) {
        var pong = pongRepository.GetById(id);
        return pong;
    }

    public Pong CreatePong(Pong pong) {
        pongRepository.CreatePong(pong);
        return pong;
    }

    public Iterable<Pong> GetAll() {
        var pongs = pongRepository.GetAll();
        return pongs;
    }

    public Pong Delete(Long id) {
        var pong = pongRepository.GetById(id);
        pongRepository.Delete(pong);
        return pong;
    }


    public Pong UpdatePong(Pong pong) {
        return pong;
    }
}
