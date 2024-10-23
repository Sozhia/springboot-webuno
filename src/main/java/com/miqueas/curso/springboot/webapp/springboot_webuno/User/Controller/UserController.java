package com.miqueas.curso.springboot.webapp.springboot_webuno.User.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(){
        return "details";
    }

}
