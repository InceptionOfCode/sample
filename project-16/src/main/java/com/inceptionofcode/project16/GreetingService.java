package com.inceptionofcode.project16;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public GreetingResponse buildGreeting() {
        return new GreetingResponse("project-16", "Hello from Spring Boot subproject 16");
    }
}
