package com.java.demo07;

import java.util.ArrayList;
import java.util.Iterator;

public class Generic {
    public static void main(String[] args) {
        show2();
    }
    /*
    * 创建集合对象:使用范型
    * 好处：
    *   1.避免了类型转化的麻烦，存储是什么类型，取出的就是什么类型
    *   2.把运行期异常（代码运行后会抛出异常），提升到了编译器（写代码的时候会报错）
    * 弊端：
    *   范型是什么类型。只能存储什么类型
    * */
    private static void show2(){
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
//        list.add(1);//编译器就会提出异常
//        使用迭代器遍历list集合
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s+"->"+s.length());
        }
    }


    /*
    * 创建集合对象，不使用泛型
    * 好处：
    *   集合不适用范型，默认类型就是Object类型，可以储存任意类型的数据
    * 弊端：
    *   不安全，引发异常*/
    private static void show1(){
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);
        //使用迭代器遍历list集合
        //获取迭代器
        Iterator it = list.iterator();
        //使用迭代器中的方法hasNext和next遍历集合
        while(it.hasNext()){
            //取出元素也是object类型
            Object obj = it.next();
            System.out.println(obj);

            //想要使用String类特有的方法，length获取字符串的长度；不能使用  多态 Object obj = "abc";
            //需要向下转型
            //会抛出ClassCastException类型转换异常，不能把Integer类型转换为String类型
            String s = (String)obj;
            System.out.println(s.length());

        }
    }
}
