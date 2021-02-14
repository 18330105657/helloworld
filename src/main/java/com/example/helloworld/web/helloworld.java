package com.example.helloworld.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parent")
public class helloworld {

    @RequestMapping("helloworld")
    public String helloworld()
    {
        return "helloworld";
    }
}
