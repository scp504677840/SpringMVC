package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigInteger;

/**
 * 注解@RequestMapping可以修饰类以及方法。
 * 1.修饰类：提供初步的请求映射信息，相对于WEB应用的根目录。
 * 2.修饰方法：提供进一步的细分映射信息。
 * 若直接修饰方法，未修饰类，那么修饰方法的URL就相对于WEB应用的根目录。
 */
@Controller
public class HelloWorld {

    /**
     * 注解@PathVariable 可以将Url中的占位符映射到方法到参数中。
     *
     * @param id 用户Id
     * @return 返回值
     */
    @RequestMapping(value = "/getUser/{id}")
    public String getUser(@PathVariable(value = "id") BigInteger id) {
        System.out.println("用户Id： " + id);
        return "success";
    }

}
