package cat.itacademy.barcelonactiva.granero.eduard.s04.t02.n03.S04T02N03GraneroEduard.controllers;

import cat.itacademy.barcelonactiva.granero.eduard.s04.t02.n03.S04T02N03GraneroEduard.model.domain.Fruit;
import cat.itacademy.barcelonactiva.granero.eduard.s04.t02.n03.S04T02N03GraneroEduard.model.services.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/fruits")
public class FruitController {
    @Autowired
    FruitService fruitService;

    @GetMapping("/getOne/{fruitId}")
    public ResponseEntity<Fruit> getOneFruit(@PathVariable("fruitId") String fruitId){
        return ResponseEntity.ok().body(this.fruitService.getOne(fruitId));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Fruit>> getAllFruit(){
        return ResponseEntity.ok().body(this.fruitService.getAll());
    }
    @PostMapping("/add")
    public ResponseEntity <Fruit> addFruit (@RequestBody Fruit fruit){
        return ResponseEntity.ok().body(this.fruitService.add(fruit));
    }

    @PutMapping("/update")
    public ResponseEntity<Fruit> updateFruit(@RequestBody Fruit fruit){
        return ResponseEntity.ok().body(this.fruitService.update(fruit));
    }

    @DeleteMapping("/delete/{fruitId}")
    public HttpStatus deleteFruit(@PathVariable("fruitId") String fruitId){
        this.fruitService.delete(fruitId);
        return HttpStatus.OK;
    }
}
