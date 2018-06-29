package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
     * 使用Servlet原生API
     * 更多可放入的请求参数请参阅request.txt
     *
     * @param request  HttpServletRequest
     * @param response HttpServletResponse
     * @return
     */
    @RequestMapping("/servletAPI")
    public String servletAPI(HttpServletRequest request, HttpServletResponse response) {
        return "success";
    }

    /**
     * UriComponentsBuilder
     * 为了准备一个相对于当前请求的主机，端口，方案，上下文路径以及servlet映射的文字部分的URL，
     * 还要考虑到头部Forwarded和 X-Forwarded-*头部。请参阅URI链接。
     *
     * @return 返回值
     */
    public String uriComponentsBuilder(UriComponentsBuilder ucb){
        return "success";
    }

    /**
     * 方法参数注解@SessionAttribute
     * 用于访问任何会话属性; 与作为类级@SessionAttributes声明结果存储在会话中的模型属性相反。有关更多详细信息，请参阅 @SessionAttribute。
     *
     * @return
     */
    @RequestMapping("/sessionAttribute")
    public String sessionAttribute(@SessionAttribute("name") String name) {
        System.out.println(name);
        return "success";
    }

    /**
     * 方法参数注解@RequestAttribute
     * 用于访问请求属性。有关更多详细信息，请参阅@RequestAttribute。
     * 任何其他的论点
     * 如果一个方法参数与上述任何一个不匹配，默认情况下，它被解析为@RequestParam一个简单类型，如BeanUtils＃isSimpleProperty所确定的 那样，或者作为@ModelAttribute其他方法。
     *
     * @return 返回值
     */
    @RequestMapping("/requestAttribute")
    public String requestAttribute(@RequestAttribute("name") String name) {
        System.out.println(name);
        return "success";
    }

}
