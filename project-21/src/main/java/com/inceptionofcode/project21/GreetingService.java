package com.inceptionofcode.project21;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public GreetingResponse buildGreeting() {
        return new GreetingResponse("project-21", "Hello from Spring Boot subproject 21");
    }
}
