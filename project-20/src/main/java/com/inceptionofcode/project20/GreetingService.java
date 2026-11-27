package com.inceptionofcode.project20;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public GreetingResponse buildGreeting() {
        return new GreetingResponse("project-20", "Hello from Spring Boot subproject 20");
    }
}
