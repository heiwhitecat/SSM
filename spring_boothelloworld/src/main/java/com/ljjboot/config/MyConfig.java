package com.ljjboot.config;

import ch.qos.logback.core.db.DBHelper;
import com.ljjboot.pojo.Emp;
import com.ljjboot.pojo.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author ljj
 * @create 2022-08-13-10:15
 */
//@Import({User.class, DBHelper.class})
@Configuration(proxyBeanMethods = false)
public class MyConfig {
    @Bean("Tom")
    public Emp tomcatPet(){
        return new Emp();
    }
    @ConditionalOnMissingBean(name = "Tom")
    @Bean //给容器添加组件  方法名作为组件id。返回类型就是组件类型。返回值就是组件在容器的实例
    public User user01(){
        return new User("sdfs");
    }

}
