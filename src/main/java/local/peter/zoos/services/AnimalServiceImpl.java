package local.peter.zoos.services;

import local.peter.zoos.models.Animal;
import local.peter.zoos.repositories.AnimalRepository;
import local.peter.zoos.view.AnimalCountZoos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "animalService")
public class AnimalServiceImpl implements AnimalService {
    @Autowired
    AnimalRepository animalrepos;

    @Override
    public List<Animal> findAllAnimals() {
        List<Animal> list = new ArrayList<>();
        animalrepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public List<AnimalCountZoos> getAnimalCountZoos() {
        return animalrepos.getCountZoos();
    }
}
