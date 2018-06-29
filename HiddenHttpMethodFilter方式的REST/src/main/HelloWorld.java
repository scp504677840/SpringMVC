package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.math.BigInteger;

/**
 * 注解@RequestMapping可以修饰类以及方法。
 * 1.修饰类：提供初步的请求映射信息，相对于WEB应用的根目录。
 * 2.修饰方法：提供进一步的细分映射信息。
 * 若直接修饰方法，未修饰类，那么修饰方法的URL就相对于WEB应用的根目录。
 *
 * HiddenHttpMethodFilter方式的REST
 * 1.在web.xml文件中配置HiddenHttpMethodFilter
 * 2.在Controller中书写请求
 * 3.在jsp的PUT和DELETE方法中加上隐藏域<input type="hidden" name="_method" value="PUT">
 */
@Controller
public class HelloWorld {

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String addUser() {
        System.out.println("Add： ");
        return "success";
    }

    /**
     * 注解@PathVariable 可以将Url中的占位符映射到方法到参数中。
     *
     * @param id 用户Id
     * @return 返回值
     */
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String getUser(@PathVariable(value = "id") BigInteger id) {
        System.out.println("Get： " + id);
        return "success";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    public String updateUser(@PathVariable(value = "id") BigInteger id) {
        System.out.println("Update： " + id);
        return "success";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable(value = "id") BigInteger id) {
        System.out.println("Delete： " + id);
        return "success";
    }

}
