package cn.itcast.day02.demo02.demo10;
/*
* 在子类的继承关系中，创建子类对象，访问成员方法的规则：
*       创建的对象是谁，就优先用谁，如果没有则向上找。
* 注意事项：
* 无论是成员方法还是成员变量，如果没有都是向上找父类，绝不会向下找子类的。
* 重写（Override)
* 概念：在继承关系中，方法名称一样，参数列表也一样。
* 重载：（Override）方法名称一样，参数列表不一样
* */

public class Demo01ExtendsMethod {
    public static void main(String[] args) {
        Zi zi = new Zi();

        zi.methodZi();
        zi.methodFu();
        zi.method();
    }
}
