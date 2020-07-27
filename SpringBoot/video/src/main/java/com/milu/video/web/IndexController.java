package com.milu.video.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Auther Jack
 * @Date 2020/7/27
 */
@Controller
public class IndexController {
    @GetMapping("/")
    //@RequestMapping(method = RequestMethod.GET,value = "/")
    public String index(){
        return "first";
    }
}