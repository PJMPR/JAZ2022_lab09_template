package com.westeros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.westeros")
public class WesterosMoviesUpdaterApplication {

    public static void main(String[] args) {
        SpringApplication.run(WesterosMoviesUpdaterApplication.class, args);
    }

}
