package repositoryInterfaces;

import entities.Pong;

public interface IPongRepository {
    //crud
    Pong GetById(Long id);

    Long CreatePong(Pong pong);

    //ICollection
    Iterable<Pong> GetAll();

    void Delete(Pong pong);
}
