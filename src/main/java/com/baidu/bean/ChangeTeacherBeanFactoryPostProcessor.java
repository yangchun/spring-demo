package com.baidu.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class ChangeTeacherBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("stu1");
        System.out.println("=========");
        MutablePropertyValues mutablePropertyValues = beanDefinition.getPropertyValues();
        PropertyValue pa = mutablePropertyValues.getPropertyValue("age");
        System.out.println(pa.getValue());
//        if(mutablePropertyValues.contains("smoking")){
//            mutablePropertyValues.add("smoking", false);
//        }
    }
}
