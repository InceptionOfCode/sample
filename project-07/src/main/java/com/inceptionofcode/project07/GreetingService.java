package com.inceptionofcode.project07;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public GreetingResponse buildGreeting() {
        return new GreetingResponse("project-07", "Hello from Spring Boot subproject 07");
    }
}
