package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 注解@RequestMapping可以修饰类以及方法。
 * 1.修饰类：提供初步的请求映射信息，相对于WEB应用的根目录。
 * 2.修饰方法：提供进一步的细分映射信息。
 * 若直接修饰方法，未修饰类，那么修饰方法的URL就相对于WEB应用的根目录。
 */
@RequestMapping("/mvc")
@Controller
public class HelloWorld {

    /**
     * 1.使用@RequestMapping注解来映射请求的URL
     * 2.返回值会通过视图解析器为实际的物理视图，对于InternalResourceViewResolver视图解析器，
     * 解析过程如下：
     * 通过prefix + returnVal + suffix 这样的方式得到实际的物理视图，然后会做转发操作。
     * 我们配置的prefix：/WEB-INF/views/
     * returnVal：success
     * suffix：.jsp
     * 于是：/WEB-INF/views/success.jsp
     *
     * @return returnVal返回值
     */
    @RequestMapping("/helloworld")
    public String hello() {
        System.out.println("Hello World");
        return "success";
    }

    /**
     * value：URL
     * method：请求方法
     *
     * @return 返回值
     */
    @RequestMapping(value = "/poetMethod", method = RequestMethod.POST)
    public String method() {
        System.out.println("method：请求方法");
        return "success";
    }

    /**
     * 请求参数
     * <p>
     * params1：表示请求必须包含名为params1的请求参数。
     * !params1：表示请求不能包含名为params1的请求参数。
     * params1 != value1：表示请求包含名为params1的请求参数，但其值不能为value1。
     * {"params1 = value1","params2"}：表示请求必须包含名为params1和params2但两个请求参数，且params1参数但值必须为value1。
     * <p>
     * 例如：
     * params = {"name", "age!=10"}
     * 请求参数中必须有name和age两个参数，且age不能等于10。否则请求无效。
     *
     * @return 返回值
     */
    @RequestMapping(value = "/getUser", method = RequestMethod.GET, params = {"name", "age!=10"})
    public String params() {
        return "success";
    }

    /**
     * 请求头
     * <p>
     * params1：表示请求必须包含名为params1的请求参数。
     * !params1：表示请求不能包含名为params1的请求参数。
     * params1 != value1：表示请求包含名为params1的请求参数，但其值不能为value1。
     * {"params1 = value1","params2"}：表示请求必须包含名为params1和params2但两个请求参数，且params1参数但值必须为value1。
     * <p>
     * 例如：
     * headers = {"Accept-Language=zh-CN,zh;q=0.9"}
     * 其中Accept-Language属性值必须为zh-CN,zh;q=0.9。否则请求无效。
     *
     * @return
     */
    @RequestMapping(value = "/headers", method = RequestMethod.GET, headers = {"Accept-Language=zh-CN,zh;q=0.9"})
    public String headers() {
        return "success";
    }

}
