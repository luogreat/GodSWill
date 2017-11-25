package com.godswill.admin;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class roleController {

    @RequestMapping("admin/role")
    public String role() {
        return "admin/role";
    }
}