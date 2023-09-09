package com.example.demo.login;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("username")
public class LoginController {

    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String loginJsp(){

        return "loginJsp";
    }
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String validationJsp(@RequestParam String username,@RequestParam String password,ModelMap modelMap){
        if(username.equals("kitare") && password.equals("123456"))
        {
            modelMap.put("username",username);
            modelMap.put("password",password);
            return "index";
        }
        else {
            modelMap.put("error","Sai Tài Khoản Mật Khẩu");
            return "loginJsp";

        }
    }
}
