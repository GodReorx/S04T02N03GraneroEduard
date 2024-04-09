package cat.itacademy.barcelonactiva.granero.eduard.s04.t02.n03.S04T02N03GraneroEduard.model.repository;


import cat.itacademy.barcelonactiva.granero.eduard.s04.t02.n03.S04T02N03GraneroEduard.model.domain.Fruit;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface FruitRepository extends MongoRepository<Fruit, String> {

}
