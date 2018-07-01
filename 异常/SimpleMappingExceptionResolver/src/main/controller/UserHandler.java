package main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserHandler {
    @ResponseBody
    @RequestMapping("/error")
    public String testError() {
        //故意制造异常
        int i = 1 / 0;
        System.out.println("---error---");
        return "ok";
    }
}
