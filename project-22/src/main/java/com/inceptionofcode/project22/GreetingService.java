package com.inceptionofcode.project22;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public GreetingResponse buildGreeting() {
        return new GreetingResponse("project-22", "Hello from Spring Boot subproject 22");
    }
}
