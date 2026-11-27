package com.inceptionofcode.project24;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public GreetingResponse buildGreeting() {
        return new GreetingResponse("project-24", "Hello from Spring Boot subproject 24");
    }
}
