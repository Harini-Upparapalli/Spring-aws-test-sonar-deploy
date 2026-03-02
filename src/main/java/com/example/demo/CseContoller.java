package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseContoller {

    @GetMapping("/cseadd")
    public String addCSE(@RequestParam int a, @RequestParam int b) {
        int sum = a + b;
        return "THE VALUE IS " + sum + " and  ROLL NUMBER IS 24P35A0555";
    }
}