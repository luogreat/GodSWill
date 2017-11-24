package com.godswill.bksys;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class First {


    @RequestMapping("/index")
    public String index() {
        return "bksys/index";
    }

}