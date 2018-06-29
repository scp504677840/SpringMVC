package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
