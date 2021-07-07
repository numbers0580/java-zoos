package local.peter.zoos.repositories;

import local.peter.zoos.models.Zoo;
import org.springframework.data.repository.CrudRepository;

public interface ZooRepository extends CrudRepository<Zoo, Long> {
}
