package local.peter.zoos.repositories;

import local.peter.zoos.models.Zooanimals;
import local.peter.zoos.models.ZooanimalsId;
import org.springframework.data.repository.CrudRepository;

public interface ZooanimalsRepository extends CrudRepository<Zooanimals, ZooanimalsId> {
}
