package com.server.hng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HngApplication {

    public static void main(String[] args) {
        SpringApplication.run(HngApplication.class, args);
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "HNG Backend Stage 1";
    }

}
