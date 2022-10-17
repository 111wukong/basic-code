package cn.itcast.day02.demo02.demo13;
//抽象方法：就是加上abstract关键字，然后去掉大括号，直接分号结束。
//抽象类：抽象方法所在的类，必须是抽象类才行。在class前面写上abstract即可

//如何使用抽象类和抽象方法：
//1，不能直接创建new抽象类对象
//2.必须用一个子类去继承父类
//3.子类必须覆盖重写抽象父类当中所有的抽象方法
//覆盖重写实现：子类去掉抽象方法的abstract关键字，然后在补上方法体大括号
//4，创建子类对象进行使用

public abstract class Animal {
    //这是一个抽象方法，代表吃东西，但是具体吃什么（大括号里面的内容）不确定
    public abstract void eat();
    //这是普通成员方法
    public void normalMethod(){

    }
}
