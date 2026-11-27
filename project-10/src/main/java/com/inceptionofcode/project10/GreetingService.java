package com.inceptionofcode.project10;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public GreetingResponse buildGreeting() {
        return new GreetingResponse("project-10", "Hello from Spring Boot subproject 10");
    }
}
