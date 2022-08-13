package com.ljjboot;

import com.ljjboot.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author ljj
 * @create 2022-08-13-9:00
 */

/**
 * 这是一个springboot 应用   srpingboot主程序
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanDefinitionName = " + beanDefinitionName);
            
        }
        User bean = run.getBean(User.class);
        System.out.println("bean = " + bean);
        boolean user = run.containsBean("com.ljjboot.pojo.User");
        System.out.println("user = " + user);
        System.out.println("user = " + user);
        System.out.println("hot-userfix = " + user);
        //修改gaishaaa
    }
}
