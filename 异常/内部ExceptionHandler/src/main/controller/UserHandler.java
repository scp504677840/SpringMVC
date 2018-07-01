package main.controller;

import main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserHandler {

    /**
     * 处理异常
     *
     * @return 处理异常后跳转的页面
     */
    @ExceptionHandler(ArithmeticException.class)
    public String errorHandler() {
        return "error";
    }

    @ResponseBody
    @RequestMapping("/error")
    public String testError() {
        //故意制造异常
        int i = 1 / 0;//java.lang.ArithmeticException: / by zero
        System.out.println("---error---");
        return "ok";
    }
}
