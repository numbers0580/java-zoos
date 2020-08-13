package local.peter.zoos.repositories;

import local.peter.zoos.models.Animals;
import org.springframework.data.repository.CrudRepository;

public interface AnimalsRepository extends CrudRepository<Animals, Long> {
}
