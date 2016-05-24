package demo.springframework.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

import java.util.Arrays;

public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("BeanFactory加载后，进一步对Bean进行定义，调用BeanDefinitionRegistryPostProcessor.postProcessBeanDefinitionRegistry");
        String[] beanDefinitionNames = registry.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));
        for (String beanName : beanDefinitionNames) {
            BeanDefinition beanDefinition = registry.getBeanDefinition(beanName);
            System.out.println("Bean的声明定义：" + beanDefinition);
            MutablePropertyValues mutablePropertyValues = beanDefinition.getPropertyValues();
            PropertyValue[] propertyValues = mutablePropertyValues.getPropertyValues();
            for (PropertyValue propertyValue : propertyValues) {
                System.out.println("---Bean的属性：" + propertyValue);
            }
        }
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }

}
