package local.peter.zoos.controllers;

import local.peter.zoos.models.Animal;
import local.peter.zoos.services.AnimalService;
import local.peter.zoos.view.AnimalCountZoos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {
    @Autowired
    AnimalService animalservice;

    //localhost:5280/animals/count
    @GetMapping(value = "/count", produces = "application/json")
    public ResponseEntity<?> listAllAnimals() {
        List<AnimalCountZoos> critters = animalservice.getAnimalCountZoos();
        return new ResponseEntity<>(critters, HttpStatus.OK);
    }
}
