package com.inceptionofcode.project01;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public GreetingResponse buildGreeting() {
        return new GreetingResponse("project-01", "Hello from Spring Boot subproject 01");
    }
}
