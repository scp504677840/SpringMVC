package main.controller;

import main.entities.User;
import main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserHandler {

    @Autowired
    private UserService userService;

    /**
     * 返回Json
     *
     * 1.加入jar包
     * - 方式一：加入gson-2.8.5.jar
     * - 方式二：加入jackson-annotations-2.9.6.jar、jackson-core-2.9.6.jar、jackson-databind-2.9.6.jar
     * 上面两个方式择其一即可。
     * 2.书写Controller，在方法上加上@ResponseBody注解。
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/users")
    public List<User> listUser() {
        System.out.println("call listUser");
        List<User> users = userService.listUser();
        System.out.println("size: " + users.size());
        users.forEach(System.out::println);
        return users;
    }

}
