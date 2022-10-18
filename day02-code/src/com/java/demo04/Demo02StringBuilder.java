package com.java.demo04;
/*
* StringBuilder类的成员方法：
*   public StringBuilder append(...)添加任意数据的字符串形式，并返回当前对象自身
*   参数：
*       可以是任意的数据类型。
* */
public class Demo02StringBuilder {
    public static void main(String[] args) {
        //创建StringBuilder对象
        StringBuilder bu1 = new StringBuilder();
        //使用append方法往StringBuilder中添加数据
        //append方法返回的是this，，调用方法的对象bu1
        StringBuilder bu2 = bu1.append("abc");
        System.out.println(bu1);
        System.out.println(bu2);
        System.out.println(bu1==bu2);
        /*
        * 链式编程：方法的返回值是一个对象，可以根据对象继续调用方法
        * */
        bu1.append(2).append("ddd").append("zhong");
        System.out.println(bu1);
    }
}
