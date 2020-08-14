package local.peter.zoos.repositories;

import local.peter.zoos.models.Zooanimal;
import local.peter.zoos.models.ZooanimalId;
import org.springframework.data.repository.CrudRepository;

public interface ZooanimalRepository extends CrudRepository<Zooanimal, ZooanimalId> {
}
