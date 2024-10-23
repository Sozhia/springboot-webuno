package com.miqueas.curso.springboot.webapp.springboot_webuno.User.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Map<String, Object> model){
        model.put("title", "Valor de atributo");
        model.put("name", "Andrew");
        model.put("lastname", "Bishop");

        return "details";
    }

}
