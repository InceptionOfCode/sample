package com.inceptionofcode.project13;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public GreetingResponse buildGreeting() {
        return new GreetingResponse("project-13", "Hello from Spring Boot subproject 13");
    }
}
