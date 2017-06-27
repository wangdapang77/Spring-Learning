package com.mynawang.test.staticfactory;

/**
 * @auther mynawang
 * @create 2017-06-27 9:50
 */
public class HelloApiStaticFactory {

    // 使用工厂方法模式
    public static HelloApi newInstance(String helloMessage) {
        // 返回需要的bean实例
        return new HelloApiImpl2(helloMessage);
    }

}
