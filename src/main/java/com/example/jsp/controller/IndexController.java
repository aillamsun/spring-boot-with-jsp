package com.example.jsp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sungang on 2017/6/13.
 */
@Controller
public class IndexController {


    // 从 application.properties 中读取配置，如取不到默认值为Hello
    @Value("${hello:Hello}")
    private String hello;

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("hello",hello);
        return "index";
    }
}
