package com.godswill;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController{

    @RequestMapping("/admin/login")
    public String login_page(){
        return "admin/login";
    }


}