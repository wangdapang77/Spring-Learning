package com.mynawang.test.staticfactory;

/**
 * @auther mynawang
 * @create 2017-06-21 10:38
 */
public class HelloApiImpl2 implements HelloApi {

    private String helloMessage;

    public HelloApiImpl2() {
        this.helloMessage = "Hello World";
    }

    public HelloApiImpl2(String helloMessage) {
        this.helloMessage = helloMessage;
    }

    @Override
    public void sayHello() {
        System.out.println(helloMessage);
    }
}
