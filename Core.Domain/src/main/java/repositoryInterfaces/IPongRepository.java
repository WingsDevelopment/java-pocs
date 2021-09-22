package repositoryInterfaces;

import entities.Pong;

public interface IPongRepository {
    //crud
    Pong GetById(Long id);

    void CreatePong(Pong pong);

    //ICollection
    Iterable<Pong> GetAll();

    void Delete(Pong pong);
}
