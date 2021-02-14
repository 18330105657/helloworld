package com.example.childdemo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/child")
public class helloworld {

    @RequestMapping("helloworld")
    public String helloworld()
    {
        return "helloworld";
    }
}
