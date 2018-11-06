package com.example.springboot21bug.junit5;

import lombok.Getter;
import lombok.Setter;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ActiveProfiles("test")
@ExtendWith(SpringExtension.class) // Needed in Spring Boot 2.0.x
public abstract class AbstractClass {

    @Autowired
    protected MyProperties myProperties;

    @Setter
    @Getter
    @Component
    @ConfigurationProperties(prefix = "properties")
    protected static class MyProperties {
        private String property;
    }
}
