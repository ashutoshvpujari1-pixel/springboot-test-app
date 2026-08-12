package com.example.springboot_test_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetWebController {

    @GetMapping("/greet")
    public String sayGoodMorning(@RequestParam(value = "name", defaultValue = "Ashutosh") String name) {
        return String.format("Good Morning %s", name);
    }
}
