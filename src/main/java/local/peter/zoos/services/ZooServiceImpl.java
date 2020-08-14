package local.peter.zoos.services;

import local.peter.zoos.models.Zoo;
import local.peter.zoos.repositories.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "ZooService")
public class ZooServiceImpl implements ZooService {
    @Autowired
    ZooRepository zoorepos;

    @Override
    public List<Zoo> findAllZoos() {
        List<Zoo> list = new ArrayList<>();
        zoorepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public Zoo findZooById(long id) {
        return zoorepos.findById(id).get();
    }
}
