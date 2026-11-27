package com.inceptionofcode.project19;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public GreetingResponse buildGreeting() {
        return new GreetingResponse("project-19", "Hello from Spring Boot subproject 19");
    }
}
