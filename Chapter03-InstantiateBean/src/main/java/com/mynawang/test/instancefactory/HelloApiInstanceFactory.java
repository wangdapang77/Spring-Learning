package com.mynawang.test.instancefactory;

/**
 * @auther mynawang
 * @create 2017-06-27 10:08
 */
public class HelloApiInstanceFactory {

    // 使用实例工厂
    public HelloApi newInstance(String helloMessage) {
        // 需要返回的bean
        return new HelloApiImpl3(helloMessage);
    }

}
