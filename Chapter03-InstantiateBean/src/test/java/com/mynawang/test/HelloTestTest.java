package com.mynawang.test;

import com.mynawang.test.constructor.HelloApi;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
* HelloTest Tester. 
* 
* @author mynawang
* @since <pre>06/27/2017</pre> 
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
     * Method: test1() 
     * 
     */
    @Test
    public void testTest1() throws Exception {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("instantiatebean1.xml");
        HelloApi helloApi1 = beanFactory.getBean("instantiatebean_id1", HelloApi.class);
        helloApi1.sayHello();

        HelloApi helloApi2 = beanFactory.getBean("instantiatebean_id2", HelloApi.class);
        helloApi2.sayHello();
    }
    
    /**
     * 
     * Method: test2() 
     * 
     */
    @Test
    public void testTest2() throws Exception { 
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("instantiatebean2.xml");
        com.mynawang.test.staticfactory.HelloApi helloApi = beanFactory.getBean(
                "instantiatebean2_id1", com.mynawang.test.staticfactory.HelloApi.class);
        helloApi.sayHello();
    }

    /**
     *
     * Method: test3()
     *
     */
    @Test
    public void testTest3() throws Exception {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("instantiatebean3.xml");
        com.mynawang.test.instancefactory.HelloApi helloApi = beanFactory.getBean(
                "instantiatebean3_id1", com.mynawang.test.instancefactory.HelloApi.class);
        helloApi.sayHello();
    }

}
