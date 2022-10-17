package cn.itcast.day02.demo02.demo09;

import java.util.Arrays;

/*
* java.util.Arrays是一个与数组相关的工具类，里面提供了大量的静态方法，用来实现数组常见的操作。
* public static String toString(数组）：将参数数组变成字符串（按照默认格式：【元素1，元素2，元素3.。。。】
* public static void sort(数组）：按照默认升序对数组元素进行排序
*
* 备注：
* 1，如果是数值，sort默认按照从小到大排序
* 2，如果是字符串，sort默认按照字母升序
* 3，如果是自定义的类型，那么自定义的类需要有Comparable或者Comparator接口的支持。
* */
public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray = {12,3,454,5};
        //将int[]数组按照默认格式变成字符串
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);

        int[] array1 = {1,3,54,6,7,4,57,64,76,43,65};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
    }
}
