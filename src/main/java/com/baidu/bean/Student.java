package com.baidu.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class Student implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,BeanPostProcessor,InitializingBean {
    private String name;
    private int age;
    private BeanFactory beanFactory;
    private boolean smoking;

    public boolean isSmoking() {
        return smoking;
    }

    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }

    public void init(){
        System.out.println("student init ");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBeanName(String s) {
        System.out.println(s);
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        if (!(beanFactory instanceof ConfigurableListableBeanFactory)) {
            throw new IllegalArgumentException("CommonAnnotationBeanPostProcessor requires a ConfigurableListableBeanFactory");
        } else {
            this.beanFactory = (ConfigurableListableBeanFactory)beanFactory;
        }
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }

    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("开始初始化");
        if (o instanceof Student) {
            ((Student) o).setSmoking(false);
        }
        return null;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("初始化完成");
        if (o instanceof Student) {
            ((Student) o).setSmoking(true);
        }
        return null;
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("检查属性");
        if (this.name == null) {
            this.name = "moren";
        }
    }
}
