package com.laotou.decoratorPattern;
/*
* 装饰对象：
* */
public class NewPerson implements  Person {

    private  OldPerson p;

    public NewPerson(OldPerson p) {
        this.p = p;
    }

    @Override
    public void eat() {
        System.out.println("生火");
        System.out.println("做饭");
        p.eat();
        System.out.println("洗碗");
    }
}
