package local.peter.zoos.services;

import local.peter.zoos.models.Zoo;

import java.util.List;

public interface ZooService {
    List<Zoo> findAllZoos();

    Zoo findZooById(long id);
}
