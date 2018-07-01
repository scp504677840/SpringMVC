package main.controller;

import main.exceptions.UsernameIsNonException;
import main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class UserHandler {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/error")
    public String testError() {
        //故意制造异常
        if (2 > 1) {
            throw new UsernameIsNonException();
        }
        System.out.println("---error---");
        return "ok";
    }

    /**
     * 被注解@ResponseStatus标记的方法为异常方法
     *
     * @return 回显结果
     */
    @ResponseStatus(value = HttpStatus.FOUND, reason = "我是一个异常方法")
    @RequestMapping("/exceptionMethod")
    public String exceptionMethod() {
        System.out.println("call exceptionMethod");
        return "ok";
    }
}
