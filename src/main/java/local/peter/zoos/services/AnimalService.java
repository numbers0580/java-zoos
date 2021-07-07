package local.peter.zoos.services;

import local.peter.zoos.models.Animal;
import local.peter.zoos.view.AnimalCountZoos;

import java.util.List;

public interface AnimalService {
    List<Animal> findAllAnimals();

    List<AnimalCountZoos> getAnimalCountZoos();
}
