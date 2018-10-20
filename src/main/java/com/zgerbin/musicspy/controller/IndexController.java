package com.zgerbin.musicspy.controller;

import com.zgerbin.musicspy.util.ApiConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("indexController")
@RequestMapping("/")
public class IndexController {

    @Autowired
    private ApiConfiguration configuration;

    @RequestMapping("index")
    public String index(Model model) {
        model.getClass().getName();
        model.addAttribute("url", configuration.getKugou());
        return "index";
    }
}
