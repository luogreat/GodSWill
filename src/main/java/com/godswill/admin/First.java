package com.godswill.admin;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class First {


    @RequestMapping("/admin/index")
    public String index() {
        return "admin/index";
    }

}