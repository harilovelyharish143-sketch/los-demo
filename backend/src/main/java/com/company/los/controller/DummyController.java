package com.company.los.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/test")
    public String test() {
        return "Auth Controller is working";
    }
}