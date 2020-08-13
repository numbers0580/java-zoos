package local.peter.zoos.repositories;

import local.peter.zoos.models.Zoos;
import org.springframework.data.repository.CrudRepository;

public interface ZooRepository extends CrudRepository<Zoos, Long> {
}
