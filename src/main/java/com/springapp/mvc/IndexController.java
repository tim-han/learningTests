package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yjhan on 2014. 7. 4..
 */

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "hello";
    }

}
