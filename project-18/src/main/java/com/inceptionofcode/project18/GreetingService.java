package com.inceptionofcode.project18;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public GreetingResponse buildGreeting() {
        return new GreetingResponse("project-18", "Hello from Spring Boot subproject 18");
    }
}
