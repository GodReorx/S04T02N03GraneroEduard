package cat.itacademy.barcelonactiva.granero.eduard.s04.t02.n03.S04T02N03GraneroEduard;

import cat.itacademy.barcelonactiva.granero.eduard.s04.t02.n03.S04T02N03GraneroEduard.model.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class S04T02N03GraneroEduardApplication {

	@Autowired
	FruitRepository fruitRepository;
	public static void main(String[] args) {
		SpringApplication.run(S04T02N03GraneroEduardApplication.class, args);
	}

}
