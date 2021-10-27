package com.xdlr.infosys.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextProvider implements ApplicationContextAware {
    private static ApplicationContext applicationContext = null;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ApplicationContextProvider.applicationContext = applicationContext;
    }


    private static ApplicationContext getApplicationContext() {
        return applicationContext;
    }


    public static Object getBean(String beanName) {
        if (null == beanName || "".equals(beanName)) {
            return "bean name is required!";
        }
        return getApplicationContext() == null?null:getApplicationContext().getBean(beanName);
    }


    public static <T> T getBean(Class<T> clazz) {
        return applicationContext.getBean(clazz);
    }
}