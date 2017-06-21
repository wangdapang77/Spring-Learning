package com.mynawang.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther mynawang
 * @create 2017-06-21 10:40
 */
public class HelloTest {

    public void HelloWorld() {
        // 读取配置文件实例化一个IOC容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("helloworld.xml");
        // 从容器中读取bean（面向接口编程）
        HelloApi helloApi = ac.getBean("hello", HelloApi.class);
        helloApi.sayHello();
    }
}
