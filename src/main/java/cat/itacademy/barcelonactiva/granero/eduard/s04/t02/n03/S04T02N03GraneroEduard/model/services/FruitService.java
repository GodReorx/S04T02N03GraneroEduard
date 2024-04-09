package cat.itacademy.barcelonactiva.granero.eduard.s04.t02.n03.S04T02N03GraneroEduard.model.services;


import cat.itacademy.barcelonactiva.granero.eduard.s04.t02.n03.S04T02N03GraneroEduard.model.domain.Fruit;

import java.util.List;

public interface FruitService {
    Fruit add (Fruit fruit);
    Fruit update (Fruit fruit);
    void delete(long fruitId);
    Fruit getOne(long fruitId);
    List<Fruit> getAll();
}
