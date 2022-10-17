package com.java.demo01;

public class TestStudent {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str.toString());//String中已经对toString方法进行了重写。

        Student s = new Student("王国华",18);//需要自己对toString进行重写，重写前：打印的是包类名@地址值。重写后，打印的是对象的属性值
        System.out.println(s);
    }
}
