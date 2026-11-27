package com.inceptionofcode.project23;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public GreetingResponse buildGreeting() {
        return new GreetingResponse("project-23", "Hello from Spring Boot subproject 23");
    }
}
