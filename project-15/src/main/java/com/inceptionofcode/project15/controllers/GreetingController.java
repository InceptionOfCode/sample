package com.inceptionofcode.project15.controllers;

import com.inceptionofcode.project15.GreetingResponse;

import com.inceptionofcode.project15.services.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping
    public GreetingResponse greeting() {
        return greetingService.buildGreeting();
    }
    @GetMapping("/extra-1")
    public String extra1() {
        return greetingService.extra1();
    }

    @GetMapping("/extra-2")
    public String extra2() {
        return greetingService.extra2();
    }

    @GetMapping("/extra-3")
    public String extra3() {
        return greetingService.extra3();
    }

    @GetMapping("/extra-4")
    public String extra4() {
        return greetingService.extra4();
    }

    @GetMapping("/extra-5")
    public String extra5() {
        return greetingService.extra5();
    }

    @GetMapping("/extra-6")
    public String extra6() {
        return greetingService.extra6();
    }

    @GetMapping("/extra-7")
    public String extra7() {
        return greetingService.extra7();
    }

    @GetMapping("/extra-8")
    public String extra8() {
        return greetingService.extra8();
    }

    @GetMapping("/extra-9")
    public String extra9() {
        return greetingService.extra9();
    }

}
