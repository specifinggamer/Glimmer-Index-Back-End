package org.glimmer.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // TODO(AntiO2) Remember delete it
public class HelloController {

    @GetMapping("/hello")
    @PreAuthorize("hasAuthority('hello')")
    String hello(){
        return "hello";
    }
    @GetMapping("/test")
    @PreAuthorize("hasAuthority('system:dept:list')")
    String test(){
        return "test";
    }
    @RequestMapping("/admin")
    @PreAuthorize("hasAuthority('admin')")
    public String admin(){
        return "admin";
    }
}
