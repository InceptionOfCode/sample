package com.inceptionofcode.project02;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public GreetingResponse buildGreeting() {
        return new GreetingResponse("project-02", "Hello from Spring Boot subproject 02");
    }
}
