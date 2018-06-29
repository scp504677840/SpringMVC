package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
     * 添加用户
     * 直接用JavaBean作为请求参数
     * 1.直接映射到JavaBean的属性上，属性名一一对应
     * 2.支持级联赋值，也就是User对象里有Address对象属性。
     *
     * @param user 用户
     * @return 返回值
     */
    @RequestMapping("/addUser")
    public String login(User user) {
        System.out.println(user);
        return "success";
    }

}
