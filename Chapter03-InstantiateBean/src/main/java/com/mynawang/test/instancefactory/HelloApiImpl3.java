package com.mynawang.test.instancefactory;

/**
 * @auther mynawang
 * @create 2017-06-21 10:38
 */
public class HelloApiImpl3 implements HelloApi {

    private String helloMessage;

    public HelloApiImpl3() {
        this.helloMessage = "Hello World";
    }

    public HelloApiImpl3(String helloMessage) {
        this.helloMessage = helloMessage;
    }

    @Override
    public void sayHello() {
        System.out.println(helloMessage);
    }
}
