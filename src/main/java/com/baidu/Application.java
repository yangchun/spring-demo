package com.baidu;

import com.baidu.bean.AutoConfigStudent;
import com.baidu.bean.Student;
import com.baidu.bean.Teacher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        // 1 通过xml加载bean
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        // 2 通过注解config加载bean
//        AnnotationConfigApplicationContext annotationConfigApplicationContext = new
//                AnnotationConfigApplicationContext(AutoConfigStudent.class);
        Student stu1 = (Student)classPathXmlApplicationContext.getBean("stu1");

        Teacher teacher = (Teacher)classPathXmlApplicationContext.getBean("teacher");
//        System.out.println(stu1.getName()+" "+stu1.getAge()+" "+stu1.isSmoking());
        System.out.println(teacher.getName()+" "+teacher.getAge());
        
        System.out.println("Spring_dev");

    }



}
