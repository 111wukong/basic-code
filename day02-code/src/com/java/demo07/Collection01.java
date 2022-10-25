package com.java.demo07;

import java.util.ArrayList;
import java.util.Collection;

/*
* boolean add(E e)  像集合中添加元素
* boolean remove（E e）  删除集合中的某个元素
* void clear();  清空集合中的所有元素
* boolean contains(E  e)  判断集合中是否包含某个元素
* boolean isEmoty()  判断集合是否为空
* int size();获取集合的长度
* Object【】 toArray（） 将集合转换成一个数组
* */
public class Collection01 {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> coll = new ArrayList<>();
        //boolean add(E e);
        coll.add("hello");
        coll.add("world");
        coll.add("java");
        System.out.println(coll);

        boolean result = coll.remove("hello");//删除某个元素
        System.out.println(result);
        System.out.println(coll);

//        coll.clear();//清空某个元素
        System.out.println(coll);
        boolean result2 = coll.contains("java");//判断集合中是否有某个元素
        System.out.println(result2);

        System.out.println(coll.size());//获取集合长度

        Object[] arr = coll.toArray();//将集合转换成一个数组
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
