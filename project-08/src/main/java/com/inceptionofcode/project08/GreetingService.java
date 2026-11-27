package com.inceptionofcode.project08;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public GreetingResponse buildGreeting() {
        return new GreetingResponse("project-08", "Hello from Spring Boot subproject 08");
    }
}
