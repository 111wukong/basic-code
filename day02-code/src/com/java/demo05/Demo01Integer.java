package com.java.demo05;
/*
* 装箱：把基本数据类型的数据，包装到包装类中（基本数据类型->包装类k）
* 构造方法：
*   Integer（int val）构造一个新分配的Integer对象，他表示指定的int值。
*   Integer（String s)构造一个新分配的Integer对象。他表示String参数 所指的int值
* 静态方法：
*   static Integer valueOf(int i)返回一个表示指定的int值的Integer实例
*   static Integer valueOf(String s)返回保存指定的String的值的Integer对象。
* 拆箱：在包装类中的去出基本数据（包装类->基本数据类型）
*   成员方法：
* int intvalue()以int类型返回该Integer的值
* */

public class Demo01Integer {
//    装箱
public static void main(String[] args) {
    //构造方法
    Integer in1 = new Integer(1);
    System.out.println(in1);//重写了toString方法
     Integer in2 = new Integer(1);
    System.out.println(in2);
    //静态方法
    Integer in3 = Integer.valueOf(1);
    System.out.println(in3);

//    Integer in4 = Integer.valueOf("a");//(NumberFormatException数字格式化异常

    //拆箱：在包装类中取出基本类型的数据(包装类->基本类型数据）
    int i = in1.intValue();
    System.out.println(i);
}
}
