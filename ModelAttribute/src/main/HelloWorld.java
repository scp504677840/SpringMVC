package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigInteger;
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
@Controller
public class HelloWorld {

    /**
     * 注解@ModelAttribute
     * 1.在目标方法执行前调用。
     *
     * @param id  用户Id
     * @param map 键值对
     */
    @ModelAttribute
    public void getUser(@RequestParam(value = "id", required = false) BigInteger id, Map<String, Object> map) {
        System.out.println("ModelAttribute");
        if (id != null) {
            //模拟User
            User user = new User(BigInteger.valueOf(1L), "Tom", "123");
            System.out.println("模拟: " + user);
            //后面的Model会用到。
            map.put("user", user);
        }
    }

    /**
     * 处理模型数据的方式：
     * - ModelAndView：在request域中
     * - Map及Model：在request域中
     * - @SessionAttributes：中Session域中
     * - @ModelAttribute
     *
     * 注解：@ModelAttribute("user")
     * 这里的 @ModelAttribute("user") 注解可以省略掉。
     * 方法上的@ModelAttribute注解和方法参数上的@ModelAttribute注解有什么不一样？
     * 1.方法上的@ModelAttribute注解：
     * - 它不带value属性。
     * - 它所修饰的方法会在目标方法执行前被调用。
     * 2.方法参数里的@ModelAttribute注解：
     * - 注解可以省略不写。
     * - 如果写上value属性，那么后面的Model就会按照value的值去找被@ModelAttribute修饰的方法存入的值。
     * - 如果注解被省略掉，那么后面的Model就会按照Model的类名的第一个字母小写（如：User对应user）去找被@ModelAttribute修饰的方法存入的值。
     *
     * @return
     */
    @RequestMapping(value = "/testModelAttribute", method = RequestMethod.POST)
    public String testModelAttribute(@ModelAttribute("user") User user) {
        System.out.println("update: " + user);
        //ModelAttribute
        //模拟: User{id=1, name='Tom', password='123'}
        //update: User{id=1, name='Jack', password='123'}
        return "success";
    }

}
