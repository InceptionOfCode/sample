package com.inceptionofcode.project12;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public GreetingResponse buildGreeting() {
        return new GreetingResponse("project-12", "Hello from Spring Boot subproject 12");
    }
}
