package com.miqueas.curso.springboot.webapp.springboot_webuno.User.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserControllerRest {

    @GetMapping("/details-json")
    public  Map<String, Object> details(){
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Valor de atributo");
        body.put("name", "Andrew");
        body.put("lastname", "Bishop");

        return body;
    }

}
