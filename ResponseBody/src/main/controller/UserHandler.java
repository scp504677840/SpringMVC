package main.controller;

import main.entities.User;
import main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Controller
public class UserHandler {

    @Autowired
    private UserService userService;
    /*
    HttpMessageConverter<T>：将请求信息转化并绑定到处理方法的入参中或将响应结果转为对应类型的响应信息。
    1.@RequestBody：接收请求信息
    2.@ResponseBody：返回响应信息
    3.HttpEntity<T>：方法入参
    4.ResponseEntity<T>：方法返回值
     */

    /**
     * 返回Json
     * <p>
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
