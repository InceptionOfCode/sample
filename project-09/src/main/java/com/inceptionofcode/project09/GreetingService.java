package com.inceptionofcode.project09;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public GreetingResponse buildGreeting() {
        return new GreetingResponse("project-09", "Hello from Spring Boot subproject 09");
    }
}
