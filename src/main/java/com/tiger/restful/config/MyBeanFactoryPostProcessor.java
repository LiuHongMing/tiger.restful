package com.tiger.restful.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("调用BeanFactoryPostProcessor的postProcessBeanFactory方法");
        BeanDefinition bd = beanFactory.getBeanDefinition("myJavaBean");
        MutablePropertyValues mpv = bd.getPropertyValues();
        if(mpv.contains("remark")) {
            mpv.addPropertyValue("remark", "在BeanFacotryPostProcessor中修改之后的备注信息");
        }

    }
}
