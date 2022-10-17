package cn.itcast.day02.demo02.demo12;
/*
* super关键字的三种用法：
* 1.在子类成员方法中，访问父类的成员变量。
* 2，在子类的成员方法中，访问父类的成员方法。
* 2，在子类的构造方法中，访问父类的构造方法。
*
* super关键字用来访问父类内容，而this关键字用来访问本类内容，用法也有三种：
* 1，在本类的成员方法中，访问本类的成员变量，
* 2.在本类的成员方法中，访问本类的另一个成员方法。
* 3，在本类的构造方法中，访问本类的另一个构造方法。
* 在第三种用法当中要注意：
* A，this(...)调用也必须是是构造方法的第一个语句，唯一一个。
* B。super和this两种构造调用，不能同时使用。
* */

public class Zi extends Fu{
    int num = 20;
    public Zi(){
        super();
    }
    public void methodZi(){
        System.out.println(super.num);  //父类中的num;
    }
    public void method(){
        super.method(); //访问父类中的method;
        System.out.println("子类方法");

    }
}
