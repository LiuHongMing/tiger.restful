package com.tiger.restful.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.util.Properties;

public abstract class AbstractPropertyConfigurer extends PropertyPlaceholderConfigurer implements InitializingBean {

    @Override
    protected void processProperties(ConfigurableListableBeanFactory beanFactoryToProcess, Properties props) throws BeansException {
        super.processProperties(beanFactoryToProcess, props);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        
    }
}
