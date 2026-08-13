package com.example.springboot_test_app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//This will instruct Spring that this class process web view
@Controller 
public class IndexPageController {

	@GetMapping("/index")
    public String displayIndexPage(Model model) {
		System.out.println("Inside IndexPageController..");
        model.addAttribute("message_hello", "Hello, Thanks for visiting Website..");
        return "index"; // This will look for a html file named index.html
    }
}