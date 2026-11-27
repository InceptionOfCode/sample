package com.inceptionofcode.project05;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public GreetingResponse buildGreeting() {
        return new GreetingResponse("project-05", "Hello from Spring Boot subproject 05");
    }
}
