package cn.volc.task.handlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName UserLoginHandlerInterceptor
 * @Author volc
 * @Description 拦截器，用于判断用户是否登录，在淘淘-web-servlet.xml文件中配置拦截器
 * @Date 2017年3月1日 下午1:03:17
 */
public class UserLoginHandlerInterceptor implements HandlerInterceptor {

    public static final String COOKIE_NAME = "TT_TOKEN";

    @Override // 前置方法
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
	return true; // 放行
    }

    @Override // 处理方法
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3) throws Exception {

    }

    @Override // 后置方法
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object arg2, Exception arg3) throws Exception {
    }

}
