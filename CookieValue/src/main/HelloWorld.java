package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
     * 注解@CookieValue获取一个Cookie的值
     * value：值
     * name：cookie名称
     * required：是否为必须
     * defaultValue：默认值
     *
     * @return 返回值
     */
    @RequestMapping("/getUser")
    public String getUser(@CookieValue("JSESSIONID") String jsessionid) {
        System.out.println(jsessionid);
        return "success";
    }

}
