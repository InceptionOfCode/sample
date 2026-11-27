package com.inceptionofcode.project11;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public GreetingResponse buildGreeting() {
        return new GreetingResponse("project-11", "Hello from Spring Boot subproject 11");
    }
}
