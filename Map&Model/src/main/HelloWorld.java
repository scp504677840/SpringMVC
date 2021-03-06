package main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Date;
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
     * 处理模型数据的方式：
     * - ModelAndView
     * - Map及Model
     * - @SessionAttributes
     * - @ModelAttribute
     * <p>
     * Map
     *
     * @return
     */
    @RequestMapping("/testMap")
    public String testMap(Map<String, Object> map) {
        map.put("names", Arrays.asList("Tom", "Jack"));
        return "success";
    }

    /**
     * Model
     *
     * @param model Model
     * @return 返回值
     */
    @RequestMapping("/testModel")
    public String testModel(Model model) {
        model.addAttribute("name", "tom");
        return "success";
    }

}
