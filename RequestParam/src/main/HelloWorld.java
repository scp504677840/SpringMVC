package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigInteger;

/**
 * 注解@RequestMapping可以修饰类以及方法。
 * 1.修饰类：提供初步的请求映射信息，相对于WEB应用的根目录。
 * 2.修饰方法：提供进一步的细分映射信息。
 * 若直接修饰方法，未修饰类，那么修饰方法的URL就相对于WEB应用的根目录。
 * <p>
 * HiddenHttpMethodFilter方式的REST
 * 1.在web.xml文件中配置HiddenHttpMethodFilter
 * 2.在Controller中书写请求
 * 3.在jsp的PUT和DELETE方法中加上隐藏域<input type="hidden" name="_method" value="PUT">
 */
@Controller
public class HelloWorld {

    /**
     * 获取用户
     *
     * @param id   用户Id
     * @param name 用户名
     * @param age  年龄
     * @return 返回值
     */
    @RequestMapping("/getUser")
    public String getUser(@RequestParam("id") BigInteger id, @RequestParam("name") String name,
                          @RequestParam(value = "age", required = false, defaultValue = "10") int age) {
        System.out.println(id + " : " + name + " : " + age);
        return "success";
    }

}
