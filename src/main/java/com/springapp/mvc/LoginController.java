package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

/**
 * Created by yjhan on 2014. 7. 4..
 */
@Controller
@RequestMapping(value = "/login" )
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String handleLogin(@RequestParam String username,
                              @RequestParam String password,
                              RedirectAttributes redirect,
                              HttpSession session)
            throws Exception {

        try {

            return "redirect:/home";
        }
        catch (Exception e) {
            redirect.addFlashAttribute("exception", e);
            return "login";
        }
    }
}
