package main.controller;

import main.entities.User;
import main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.Instant;

@Controller
public class UserHandler {

    @Autowired
    private UserService userService;

    /**
     * 文件上传
     *
     * @param desc 文件描述
     * @param file 文件
     * @return 回显结果
     */
    @ResponseBody
    @RequestMapping("/fileUpload")
    public String fileUpload(@RequestParam("desc") String desc, @RequestParam("file") MultipartFile file) {
        System.out.println("desc: " + desc);
        System.out.println("fileName: " + file.getOriginalFilename());
        //desc: qq
        //fileName: demo.txt
        return "ok";
    }

    /**
     * 获取用户信息
     *
     * @return 用户信息
     */
    @ResponseBody
    @RequestMapping("/user")
    public User getUser() {
        return new User(BigInteger.ONE, "tom", "123",
                Timestamp.from(Instant.now()), new Date(System.currentTimeMillis()));
    }
}
