package com.example.springboot21bug.junit5;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import static org.assertj.core.api.Assertions.*;

@WebMvcTest
class WithJUnit5 extends AbstractClass {

    @Test
    void contextLoads() {
        assertThat(myProperties.getProperty()).isEqualTo("test"); // the assertion passes in Spring Boot 2.0.x
    }

    // this Spring Boot Application is not necessary,
    // but the test will pass if the class MyProperties is configured there (and removed from the parent)
    /*
    @SpringBootApplication
    static class Application {
        public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
        }

        @Setter
        @Getter
        @Component
        @ConfigurationProperties(prefix = "properties")
        protected static class MyProperties {
            private String property;
        }
    }*/
}
