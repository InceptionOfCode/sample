package com.inceptionofcode.project06;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public GreetingResponse buildGreeting() {
        return new GreetingResponse("project-06", "Hello from Spring Boot subproject 06");
    }
}
