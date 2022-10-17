package com.java.demo01;

public class Demo02Equals {
    public static void main(String[] args) {
        /*
        * person类默认继承了object类，所以可以使用object类的equals方法
        * boolean equals（Object obj）指示其他某个对象是否于此对象“相等”
        * Object类equals方法的源码：
        *  public boolean equals(Object obj){
        *       return(this == obj);
        * }
        * 参数：
        *   object obj：可以传递任意对象
        * 方法体：
        *   ==：比较运算符，返回的就是一个布尔值true，false
        *   基本数据类型：比较的是值。
        *   引用数据类型：比较的是两个对象的地址值。
        *   this是是谁？那个对象调用的方法，方法中的this就是哪个对象;p1调用的equals方法，所以this是p1
        *   obj是谁？传递过来的参数p2
        *   this==obj -->p1==p2
        * */
        Person p1 = new Person("王国华",18);
        Person p2 = new Person("王国华",18);

//        p1=p2;
        System.out.println("p1:" + p1);
        System.out.println("p2:" + p2);

        boolean b = p1.equals(p2);
        System.out.println(b);
    }
}
