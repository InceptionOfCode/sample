package com.inceptionofcode.project03;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public GreetingResponse buildGreeting() {
        return new GreetingResponse("project-03", "Hello from Spring Boot subproject 03");
    }
}
