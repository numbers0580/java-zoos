package local.peter.zoos.controllers;

import local.peter.zoos.models.Zoo;
import local.peter.zoos.services.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/zoos")
public class ZooController {
    @Autowired
    ZooService zooservice;

    //localhost:5280/zoos/zoos
    @GetMapping(value = "/zoos", produces = "application/json")
    public ResponseEntity<?> findAllZoos() {
        List<Zoo> listZoos = zooservice.findAllZoos();
        return new ResponseEntity<>(listZoos, HttpStatus.OK);
    }

    //localhost:5280/zoos/zoo/:id
    @GetMapping(value = "/zoo/{zid}", produces = "application/json")
    public ResponseEntity<?> findZooById(@PathVariable long zid) {
        Zoo uniqueZoo = zooservice.findZooById(zid);
        return new ResponseEntity<>(uniqueZoo, HttpStatus.OK);
    }

    //STRETCH
    //POST - localhost:5280/zoos/zoo

    //PUT - localhost:5280/zoos/zoo/:id

    //PATCH - localhost:5280/zoos/zoo/:id

    //DELETE - localhost:5280/zoos/zoo/:id
}
