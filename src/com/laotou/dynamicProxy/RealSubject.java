package com.laotou.dynamicProxy;

/*
* 定义了一个类来实现这个接口，这个类就是我们的真实对象，RealSubject类：
* */
public class RealSubject implements Subject {
    @Override
    public void rent() {
        System.out.println("我想租房子");
    }

    @Override
    public void hello(String str) {
        System.err.println("laotou:"+str);
    }

}
