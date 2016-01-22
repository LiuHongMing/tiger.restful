package com.tiger.restful.utils;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

public class SpringContextHolder implements ApplicationContextAware, DisposableBean {

	private static ApplicationContext applicationContext = null;

    /**
     * 实现ApplicationContextAware接口的回调方法，设置上下文环境
     *
     * @param applicationContext
     * @throws BeansException
     */
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		SpringContextHolder.applicationContext = applicationContext;
	}

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

    /**
     * 获取实例化对象，自动转型为所赋值对象的类型
     *
     * @param name
     * @param <T>
     * @return
     * @throws BeansException
     */
	public static <T> T getBean(String name) throws BeansException {
		return (T) applicationContext.getBean(name);
	}

	@Override
	public void destroy() throws Exception {

	}
}
