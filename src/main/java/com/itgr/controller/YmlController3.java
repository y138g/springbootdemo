package com.itgr.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class YmlController3 {
    @Value("${myconfig.myport}")
    private int myConfig;

    @RequestMapping("/yml3")
    @ResponseBody
    public String yml3(){
        System.out.println(myConfig);
        return "hello springboot";
    }

}
