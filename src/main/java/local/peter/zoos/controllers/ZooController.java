package local.peter.zoos.controllers;

import local.peter.zoos.services.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zoos")
public class ZooController {
    @Autowired
    ZooService zooService;

    //localhost:5280/zoos/zoos

    //localhost:5280/zoos/zoo/:id

    //STRETCH
    //POST - localhost:5280/zoos/zoo

    //PUT - localhost:5280/zoos/zoo/:id

    //PATCH - localhost:5280/zoos/zoo/:id

    //DELETE - localhost:5280/zoos/zoo/:id
}
