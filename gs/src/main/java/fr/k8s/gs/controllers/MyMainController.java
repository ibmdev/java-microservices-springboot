package fr.k8s.gs.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/k8s")
public class MyMainController {

    public MyMainController() {
        System.out.println("K8S > MyMainController > Constructor");
    }
    // Health Check
    @GetMapping(value = "/{id}")
    public String healthCheck(@PathVariable String id) {
        return id;
    }
}
