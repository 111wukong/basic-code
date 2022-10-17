package cn.itcast.day01.demo01;
/*
* 如何获取数组的长度，格式：
* 数组名称：Length
*
* 这将会得到一个int数字，代表数组的长度。
* 数组一旦被创建，程序运行期间，长度不可改变。
* */

import java.util.jar.JarOutputStream;

public class Demo01ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        int[] arrayB = {10,20,20,2030,83};
        int len = arrayB.length;
        System.out.println("arrayB数组的长度是：" + len);
    }
}
