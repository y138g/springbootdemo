package com.itgr.controller;

import com.itgr.domain.Grade;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
@ConfigurationProperties(prefix = "user1")
public class YmlController2 {
    private int id;
    private String name;
    private List<String> address;
    private List<Grade> grades;

    @RequestMapping("/yml2")
    @ResponseBody
    public String yml2(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(address);
        System.out.println(grades);
        return "hello springboot";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String username) {
        this.name = username;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }
}
