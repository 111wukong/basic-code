package cn.itcast.day02.demo02.demo05;
/*
* ArrayList当中常用的方法有：
* public boolean add(E e):向集合中添加元素，参数类型和范型一致，返回值代表添加是否成功。
* public E get(int index):从集合中获取元素，参数是索引编号，返回值就是对应位置的元素。
* public E remove(int index):从集合中删除元素，参数是索引编号，返回值就是被删除掉的元素
* public int size():获取集合的尺寸长度，返回值是集合中包含的元素个数
*
* */

import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        //向集合中添加元素：add
        boolean success = list.add("柳岩");
        System.out.println(list);
        System.out.println("添加的动作是否成功：" + success);
        list.add("王国华");
        list.add("胡歌");
        list.add("彭于晏");
        list.add("吕布");

        System.out.println(list);

        //从集合中获取元素：get,索引值从零开始。
        String name = list.get(2);
        System.out.println("第二号索引位置：" + name);

        //从集合中删除元素：remove.索引从零开始。
        String whoRemoved = list.remove(3);
        System.out.println("被删除的人是：" + whoRemoved);
        System.out.println(list);

        //获取集合的长度尺寸，也就是其中元素的个数
        int size = list.size();
        System.out.println("集合的长度是：" + size);







    }
}
