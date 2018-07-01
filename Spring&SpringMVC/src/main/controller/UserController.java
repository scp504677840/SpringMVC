package main.controller;

import main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    public UserController() {
        System.out.println("UserHandler构造函数");
    }

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/show")
    public String show() {
        return "ok";
    }
}
