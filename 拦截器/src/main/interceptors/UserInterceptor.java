package main.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 下面是文件上传时的执行顺序：
 * 返回true：
 * --- preHandle ---
 * desc: ww
 * fileName: demo.txt
 * --- postHandle ---
 * --- afterCompletion ---
 *
 * 返回false：
 * --- preHandle ---
 */
public class UserInterceptor implements HandlerInterceptor {

    /**
     * 1.在目标方法执行之前调用
     * 2.可以处理request
     * 3.返回true：放行；调用其他组件继续处理请求。false：拦截；不再调用其他组件继续处理请求。
     *
     * @param request  HttpServletRequest
     * @param response HttpServletResponse
     * @param handler  Object
     * @return true：放行；调用其他组件继续处理请求。false：拦截；不再调用其他组件继续处理请求。
     * @throws Exception 异常
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("--- preHandle ---");
        return true;
    }

    /**
     * 在渲染视图之前调用。
     * 1.该方法在目标方法处理完请求后调用，但是在DispatcherServlet向客户端返回响应前被调用。
     * 2.可以对用户请求进行处理。
     *
     * @param request      HttpServletRequest
     * @param response     HttpServletResponse
     * @param handler      Object
     * @param modelAndView 模型和视图
     * @throws Exception 异常
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("--- postHandle ---");
    }

    /**
     * 在渲染视图之前调用。
     * 1.在DispatcherServlet之后调用。
     * 2.可以做一些清理工作。
     *
     * @param request  HttpServletRequest
     * @param response HttpServletResponse
     * @param handler  Object
     * @param ex       异常
     * @throws Exception 异常
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("--- afterCompletion ---");
    }
}
