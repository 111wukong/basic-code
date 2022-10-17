package com.java.demo04;

import java.util.Arrays;

/*
* java.lang.System类中提供了大量的静态方法，可以获取与系统相关的信息或系统级操作。在System类的API文档中常用的方法有:
*       -public static long currentTimeMillis():返回以毫秒为单位的当前时间。
*       -public static void arraycope(Object src,int srcPos,Object dest,int despos,int length)
*           :将数组中指定的数据拷贝到另一个数组中。
* */
public class System01 {
    public static void main(String[] args) {
        demo02();
    }
    /*
    * -public static long currentTimeMillis():返回以毫秒为单位的当前时间。
    * 可以用来测试程序的效率
    * */
    private static  void demo01(){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("一共耗时："+ (end-start) +"毫秒");
    }
    /*  -public static void arraycope(Object src,int srcPos,Object dest,int despos,int length)
     *           :将数组中指定的数据拷贝到另一个数组中。
     *  参数：
     * src：源数组  srcpos：源数组的起始位置 dest：目标数组   destpos：目标数据中的起始位置  length：要复制的数组元素的个数
     *
     * */
    private static void demo02(){
        int[] src = new int[]{1,2,3,4,5};
        int[] dest = new int[]{6,7,8,9,10};

        System.arraycopy(src,0,dest,0,3);
        System.out.println(Arrays.toString(src));
        System.out.println(Arrays.toString(dest));
    }
}
