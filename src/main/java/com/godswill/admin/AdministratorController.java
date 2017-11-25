package com.godswill.admin;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/")
public class AdministratorController {
    @RequestMapping("role")
    public String adminRole() {
        return "admin/admin-role";
    }
    @RequestMapping("permission")
    public String adminPermission() {
        return "admin/admin-permission";
    }
    @RequestMapping("list")
    public String role() {
        return "admin/admin-list";
    }
}