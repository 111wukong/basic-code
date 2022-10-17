package cn.itcast.day02.demo02.demo20;
/*
* 如果一个事物的内部包含另一个事物，那么就是一个类内部包含另一个类
* 分类：
* 1，成员内部类
* 2，局部内部类
*
* 成员内部类定义格式：
* 修饰符 class 外部类名称{
*   修饰符 class 内部类名称{
*     //、、、 }
* //、、、、
*   }
* 注意：内用外，随意访问。外用内：需要内部类对象
* 如何使用成员内部类？
* 1，间接方法：在外部类的方法中，和使用内部类;然后main只是调用外部类的方法。
* 2.直接方法：公式
* 外部类名称.内部类名称 对象名 = new 外部类名称（）.new 内部类名称（）;
* */
public class Demo01InnerClass {
    public static void main(String[] args) {
        Body body = new Body();//外部类的对象
        body.methodBody();//通过外部类的对象，调用外部类的方法
        System.out.println("--------------");
        //直接方法：
        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }

}
