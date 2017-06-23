package com.mynawang.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
* HelloTest Tester. 
* 
* @author mynawang
* @since <pre>06/23/2017</pre> 
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
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("declarebean1.xml");
        HelloApi helloApi = beanFactory.getBean(HelloApi.class);
        helloApi.sayHello();
    } 
    
    /**
     * 
     * Method: test2() 
     * 
     */
    @Test
    public void testTest2() throws Exception { 
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("declarebean2.xml");
        HelloApi helloApi = beanFactory.getBean("declarebean2_id1", HelloApi.class);
        helloApi.sayHello();
    } 
    
    /**
     * 
     * Method: test3() 
     * 
     */
    @Test
    public void testTest3() throws Exception {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("declarebean3.xml");
        HelloApi helloApi = beanFactory.getBean("declarebean3_name1", HelloApi.class);
        helloApi.sayHello();
    } 
    
    /**
     * 
     * Method: test4() 
     * 
     */
    @Test
    public void testTest4() throws Exception {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("declarebean4.xml");
        // 根据id获取bean
        HelloApi helloApi1 = beanFactory.getBean("declarebean4_id1", HelloApi.class);
        helloApi1.sayHello();

        // 根据name获取bean
        HelloApi helloApi2 = beanFactory.getBean("declarebean4_alias1",HelloApi.class);
        helloApi2.sayHello();

        // 根据id获取bean
        HelloApi helloApi3 = beanFactory.getBean("declarebean4_2", HelloApi.class);
        helloApi3.sayHello();
    }
    
    /**
     * 
     * Method: test5() 
     * 
     */
    @Test
    public void testTest5() throws Exception {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("declarebean5.xml");

        // 根据id获取bean
        HelloApi helloApi1 = beanFactory.getBean("declarebean5_name1", HelloApi.class);
        helloApi1.sayHello();

        // 根据别名获取bean
        HelloApi helloApi2 = beanFactory.getBean("declarebean5_name2", HelloApi.class);
        helloApi2.sayHello();

        // 获取所有别名
        String[] beanAlias1 = beanFactory.getAliases("declarebean5_name1");
        System.out.println("=====================declarebean5.xml declarebean5_name1别名===================");
        for (String alias : beanAlias1) {
            System.out.println(alias);
        }
        Assert.assertEquals(3, beanAlias1.length);



        // 根据id获取bean
        HelloApi helloApi3 = beanFactory.getBean("declarebean5_id1", HelloApi.class);
        helloApi1.sayHello();

        // 根据别名获取bean
        HelloApi helloApi4 = beanFactory.getBean("declarebean5_2name1", HelloApi.class);
        helloApi1.sayHello();

        // 获取所有别名
        String[] beanAlias2 = beanFactory.getAliases("declarebean5_id1");
        System.out.println("=====================declarebean5.xml declarebean5_id1别名===================");
        for (String alias : beanAlias2) {
            System.out.println(alias);
        }
        Assert.assertEquals(2, beanAlias2.length);


    } 
    
    /**
     * 
     * Method: test6() 
     * 
     */
    @Test
    public void testTest6() throws Exception {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("declarebean6.xml");

        // 根据id获取bean
        HelloApi helloApi1 = beanFactory.getBean("declarebean6_name1", HelloApi.class);
        helloApi1.sayHello();

        // 根据别名获取bean
        HelloApi helloApi2 = beanFactory.getBean("declarebean6_alias1", HelloApi.class);
        helloApi2.sayHello();

        // 根据别名获取bean
        HelloApi helloApi3 = beanFactory.getBean("declarebean6_alias2", HelloApi.class);
        helloApi3.sayHello();

        System.out.println("=====================declarebean5.xml declarebean6_name1别名===================");
        String[] beanAlias1 = beanFactory.getAliases("declarebean6_name1");
        for (String alias : beanAlias1) {
            System.out.println(alias);
        }
    } 
    
}
