package cn.itcast.day02.demo02.demo09;

import java.util.Arrays;

/*
* 使用Arrays相关的API，将随机字符串中的所有字符升序排列，并倒序打印
* */
public class Demo02ArraysPractise {
    public static void main(String[] args) {
        String str = "fhdgkvgsdfhghkdfhjghdfhjgiklsdf";
        //如何进行升序排列：sort;
        //必须是一个数组，才能用Arrays。sort方法
        //String-->数组，用toCharArray()
        char[] chars = str.toCharArray();
        Arrays.sort(chars);//对数组进行升序排列

        //需要倒序遍历
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }

    }
}
