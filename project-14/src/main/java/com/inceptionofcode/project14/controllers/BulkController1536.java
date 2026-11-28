package com.inceptionofcode.project14.controllers;

import com.inceptionofcode.project14.services.BulkService1536;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/project-14/bulk-1536")
public class BulkController1536 {

    private final BulkService1536 service;

    public BulkController1536(BulkService1536 service) {
        this.service = service;
    }

    @GetMapping
    public String get() {
        return service.get();
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
        return service.extra8();
    }

    @GetMapping("/extra-9")
    public String extra9() {
        return service.extra9();
    }

}
