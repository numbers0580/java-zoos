package local.peter.zoos.services;

import local.peter.zoos.models.Animals;
import local.peter.zoos.repositories.AnimalsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "animalsService")
public class AnimalsServiceImpl implements AnimalsService {
    @Autowired
    AnimalsRepository animalsrepos;

    @Override
    public Animals findAnimalById(long id) {
        return null;
    }

    @Override
    public List<Animals> findAllAnimals() {
        List<Animals> list = new ArrayList<>();
        animalsrepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }
}
