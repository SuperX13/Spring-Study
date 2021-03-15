package com.yyx.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("user")
@Scope("prototype")
/*相当于配置文件中 <bean id="user" class="com.yyx.pojo.User"/>*/
public class User {
    //相当于配置文件中 <property name="name" value="小明"/>
    @Value("小明")
    public String name;
}
