package org.glimmer.controller;

import org.glimmer.domain.ResponseResult;
import org.glimmer.domain.User;
import org.glimmer.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;
    @PostMapping("/login")
    public ResponseResult login(@RequestBody User user) {
        return loginService.login(user);
    }
    @RequestMapping("/logoff")
    public ResponseResult logout() {
        return loginService.logout();
    }
}
