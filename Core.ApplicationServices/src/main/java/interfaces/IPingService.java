package interfaces;

import entities.Ping;
import entities.PingPongTable;
import entities.Pong;

public interface IPingService {
    //other use cases
    Pong Ping(Long pingId);

    //crud
    Ping GetById(Long id);

    void CreateTable(Ping ping);

    //ICollection
    Iterable<Ping> GetAll();

    void Delete(Ping ping);
}
