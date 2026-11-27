package com.inceptionofcode.project15;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public GreetingResponse buildGreeting() {
        return new GreetingResponse("project-15", "Hello from Spring Boot subproject 15");
    }
}
