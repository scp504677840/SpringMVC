package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Arrays;
import java.util.Map;

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
@SessionAttributes(value = {"address"}, types = {String.class, Integer.class})
@Controller
public class HelloWorld {

    /**
     * 处理模型数据的方式：
     * - ModelAndView
     * - Map及Model
     * - @SessionAttributes
     * - @ModelAttribute
     * <p>
     * <p>
     * 注解@SessionAttributes
     * 1.只能修饰类
     * 2.解释@SessionAttributes(value = {"user"}, types = {String.class, Integer.class})
     * value：将参数为user的键值对放入session域中。
     * types：将String类型和Integer类型的值放入session域中。
     * 3.一般方法上用Map来作为请求参数
     * 下面例子中map存放的键值对元素，都将会放入session域中。
     * 第一个会放入session域中是因为@SessionAttributes的value中有user。
     * 第二个会放入session域中是因为@SessionAttributes的tyoes中有String类型。
     *
     * @return
     */
    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Map<String, Object> map) {
        map.put("address", new Address("Shanghai", "nanjingdonglu"));
        map.put("name", "cher");
        return "success";
    }

}
