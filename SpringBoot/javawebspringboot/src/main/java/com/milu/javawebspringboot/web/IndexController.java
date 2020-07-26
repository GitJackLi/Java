package com.milu.javawebspringboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther Jack
 * @Date 2020/7/26
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "first";
    }
}
