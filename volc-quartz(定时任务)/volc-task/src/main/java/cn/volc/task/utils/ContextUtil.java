package cn.volc.task.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

public class ContextUtil {

    private static ApplicationContext context;

    public static ApplicationContext getContext() {
	return context;
    }

    public static Object getBean(String beanName) {
	return context.getBean(beanName);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	context = applicationContext;
    }

}
