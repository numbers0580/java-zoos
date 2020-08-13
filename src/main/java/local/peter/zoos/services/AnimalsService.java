package local.peter.zoos.services;

import local.peter.zoos.models.Animals;

import java.util.List;

public interface AnimalsService {
    Animals findAnimalById(long id);

    List<Animals> findAllAnimals();
}
