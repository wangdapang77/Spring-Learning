package com.mynawang.test.constructor;

/**
 * @auther mynawang
 * @create 2017-06-21 10:38
 */
public class HelloApiImpl1 implements HelloApi{

    private String helloMessage;

    public HelloApiImpl1() {
        this.helloMessage = "Hello World";
    }

    public HelloApiImpl1(String helloMessage) {
        this.helloMessage = helloMessage;
    }

    @Override
    public void sayHello() {
        System.out.println(helloMessage);
    }
}
