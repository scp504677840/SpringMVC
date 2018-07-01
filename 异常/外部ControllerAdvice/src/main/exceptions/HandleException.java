package main.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 注解@ControllerAdvice
 *
 * 1.里面我们可以看到有RuntimeException和ArithmeticException
 * 2.其中ArithmeticException是RuntimeException的子类
 * 3.如果将ArithmeticException移除，程序抛出的ArithmeticException就会被父类RuntimeException异常接住。
 */
@ControllerAdvice
public class HandleException {

    /**
     * 处理RuntimeException异常
     *
     * @param ex RuntimeException
     * @return 处理之后返回的结果页面
     */
    @ExceptionHandler({RuntimeException.class})
    public ModelAndView handleRuntimeException(Exception ex) {
        System.out.println(ex);
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("exception", ex);
        return modelAndView;
    }

    /**
     * 处理ArithmeticException异常
     *
     * @param ex ArithmeticException
     * @return 处理之后返回的结果页面
     */
    @ExceptionHandler({ArithmeticException.class})
    public ModelAndView handleArithmeticException(Exception ex) {
        System.out.println(ex);
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("exception", ex);
        return modelAndView;
    }

}
