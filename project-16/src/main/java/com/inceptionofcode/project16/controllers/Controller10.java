package com.inceptionofcode.project16.controllers;

import com.inceptionofcode.project16.services.Service10;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/project-16/resource-10")
public class Controller10 {

    private final Service10 service;

    public Controller10(Service10 service) {
        this.service = service;
    }

    @PostMapping
    public String create(@RequestParam String value) {
        return service.create(value);
    }

    @GetMapping
    public List<String> findAll() {
        return service.findAll();
    }
    @GetMapping("/extra-1")
    public String extra1() {
        return service.extra1();
    }

    @GetMapping("/extra-2")
    public String extra2() {
        return service.extra2();
    }

    @GetMapping("/extra-3")
    public String extra3() {
        return service.extra3();
    }

    @GetMapping("/extra-4")
    public String extra4() {
        return service.extra4();
    }

    @GetMapping("/extra-5")
    public String extra5() {
        return service.extra5();
    }

    @GetMapping("/extra-6")
    public String extra6() {
        return service.extra6();
    }

    @GetMapping("/extra-7")
    public String extra7() {
        return service.extra7();
    }
    @GetMapping("/extra-8")
    public String extra8() {
        return "extra-8";
    }

}
