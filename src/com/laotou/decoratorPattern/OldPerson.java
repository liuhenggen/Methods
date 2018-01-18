package com.laotou.decoratorPattern;
/*
* 被装饰对象
* */

public class OldPerson  implements  Person{

    @Override
    public void eat() {
        System.out.println("吃饭");
    }
}
