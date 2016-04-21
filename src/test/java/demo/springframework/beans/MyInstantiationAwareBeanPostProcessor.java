package demo.springframework.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

public class MyInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("调用MyInstantiationAwareBeanPostProcessor的postProcessBeforeInstantiation");

        Object obj = null;
        // 当返回的值不为null时，会出现短路的情况。
        // 唯一将要被执行的是以存在配置中的BeanPostProcessor.postProcessAfterInitialization方法
//        try {
//            obj = beanClass.newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }

        return obj;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println("MyInstantiationAwareBeanPostProcessor, 对象" + beanName + "调用构造方法之后的数据：" + bean.toString());
        return true;
    }

}
