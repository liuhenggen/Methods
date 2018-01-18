package com.laotou.decoratorPattern;
/*装饰者模式
* 定义：
    在不必改变原类文件和原类使用的继承的情况下，动态地扩展一个对象的功能。
    它是通过创建一个包装对象，也就是用装饰来包裹真实的对象来实现。

    角色：
    抽象构件角色（Project）：给出一个接口，以规范准备接收附加责任的对象。
    具体构件角色（Employe）：定义一个将要接收附加责任的类。
    装饰角色（Manager）：持有一个构件对象的实例，并定义一个与抽象构件接口一致的接口。
    具体装饰角色（ManagerA、ManagerB）：负责给构件对象“贴上”附加的责任。


    结论： 通过例子可以看到，没有改变原来的OldPerson类，同时也没有定义他的子类而实现了Person的扩展，这就是装饰者模式的作用。

* */

public class Test {
    public static void main(String[] args) {
        OldPerson o = new OldPerson();
        NewPerson n = new NewPerson(o);
        n.eat();
    }
}
