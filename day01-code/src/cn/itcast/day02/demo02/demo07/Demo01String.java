package cn.itcast.day02.demo02.demo07;
/*
* java.lang.String类代表字符串
* 字符串的特点：
* 1，字符串的内容永不改变。
* 2.正是因为字符串不可改变，所以字符串是可以共享使用的。
* 3。字符串效果上相当于是char[]字符数组，但是底层原理是byte[]字节数组。
*
* 创建字符串的常见3+1种方式：
* 三种构造方式：
* public String():创建一个空白字符串，不含有任何内容。
* public String(char[] array):根据字符数组的内容，来创建对应的字符串
* public String(byte[] array):根据字节数组的内容，来创建对应的字符串
* 一种直接创建：
* String str = "hello";//右边直接使用双引号,直接写上双引号，就是字符串对象。
*
* 字符串常量池：程序当中直接写上的双引号字符串，就在字符串常量池中。
* 对于基本类型来说，==是进行数值的比较。
* 对于引用类型来说，==是进行【地址值】的比较
* */

public class Demo01String {
    public static void main(String[] args) {
//        使用空参构造
        String str1 = new String(); //小括号留空，说明字符串什么内容都没有。
        System.out.println("第一个字符串：" + str1);

//        根据字符数组创建字符串
        char[] charArray = {'a','b','c'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串：" + str2);

//        根据字节数组创建字符串
        byte[] byteArray = {97,98,99};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串：" + str3);

//        直接创建字符串
        String str4 = "hello";
        System.out.println("第四个字符串：" + str4);

    }
}
