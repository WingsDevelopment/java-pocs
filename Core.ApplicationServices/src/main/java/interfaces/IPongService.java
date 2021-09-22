package interfaces;

import entities.Ping;
import entities.Pong;

public interface IPongService {
    //other use cases
    Ping Pong(Long pongId);

    //crud
    Pong GetById(Long id);

    Pong CreatePong(Pong pong);

    //ICollection
    Iterable<Pong> GetAll();

    Pong Delete(Long id);

    Pong UpdatePong(Pong pong);
}
