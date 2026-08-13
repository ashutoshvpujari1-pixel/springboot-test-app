package com.example.springboot_test_app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//This will instruct Spring that this class process web view
@Controller 
public class WelcomePageController {

	@GetMapping("/welcome")
    public String displayIndexPage(Model model) {
		System.out.println("Inside WelcomePageController..");
        return "welcome"; // This will look for a html file named welcome.html
    }
}