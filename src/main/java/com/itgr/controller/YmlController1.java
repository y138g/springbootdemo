package com.itgr.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class YmlController1 {
    @Value("${name}")
    public String name;

    @Value("${student1.age}")
    public int age;

    @Value("${city1[0]}")
    public String city1;

    @Value("${students[0].score}")
    public double score;

    @RequestMapping("/yml1")
    @ResponseBody
    public String yml1(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(city1);
        System.out.println(score);
        return "hello spring boot!";
    }
}
