package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @RequestMapping("/hello")
	public String printWelcome(@RequestParam String name, Model model) {
		model.addAttribute("message", "Hello " + name);
		return "hello";
	}

    @RequestMapping("/abc")
    public String printWelcomeABC(@RequestParam String name, Model model) {
        model.addAttribute("message", "Hi " + name);
        return "hello";
    }
}