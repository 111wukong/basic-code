package cn.itcast.day02.demo02.demo08;
/*
* 静态代码块的格式：
* public class 类名称{
*   static{
*   代码块的内容
*      }
* }
* 特点：当第一次用到本类的时候，静态代码块执行唯一一次。
* */
public class Person {
    static{
        System.out.println("静态代码块执行！");
    }
    public Person(){
        System.out.println("构造方法执行！！");
    }
}
