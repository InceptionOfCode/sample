package com.inceptionofcode.project14;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public GreetingResponse buildGreeting() {
        return new GreetingResponse("project-14", "Hello from Spring Boot subproject 14");
    }
}
