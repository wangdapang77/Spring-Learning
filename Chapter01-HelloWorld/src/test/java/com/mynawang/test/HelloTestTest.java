package com.mynawang.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
* HelloTest Tester. 
* 
* @author mynawang
* @since <pre>06/21/2017</pre> 
* @version 1.0 
*/ 
public class HelloTestTest { 

    @Before
    public void before() throws Exception { 
    } 

    @After
    public void after() throws Exception { 
    } 

    /**
     * 
     * Method: HelloWorld() 
     * 
     */
    @Test
    public void testHelloWorld() {
        // 读取配置文件实例化一个IOC容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("helloworld.xml");
        // 从容器中读取bean（面向接口编程）
        HelloApi helloApi = ac.getBean("hello", HelloApi.class);
        helloApi.sayHello();
    }
    
}
