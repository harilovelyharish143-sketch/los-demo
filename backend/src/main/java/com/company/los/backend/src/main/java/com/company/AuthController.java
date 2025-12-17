package com.company.los;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public String login() {
        return "Login API working";
    }

    @PostMapping("/register")
    public String register() {
        return "Register API working";
    }
}

