package interfaces;

import entities.Ping;
import entities.PingPongTable;

public interface IPingPongTableService {
    PingPongTable GetById(Long id);

    void CreateTable(PingPongTable table);

    //ICollection
    Iterable<PingPongTable> GetAll();

    void Delete(PingPongTable table);
}
