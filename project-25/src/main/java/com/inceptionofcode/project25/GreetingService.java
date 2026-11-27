package com.inceptionofcode.project25;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public GreetingResponse buildGreeting() {
        return new GreetingResponse("project-25", "Hello from Spring Boot subproject 25");
    }
}
