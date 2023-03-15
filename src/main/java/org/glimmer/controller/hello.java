package org.glimmer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // TODO(AntiO2) Remember delete it
@RequestMapping("/test")
public class hello {

    @GetMapping("/hello")
    String test(){
        return "let's go";
    }
}
