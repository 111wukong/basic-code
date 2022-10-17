package com.java.demo02;
import java.util.Date;
public class Date01 {
    public static void main(String[] args) {
        demo01();
    }
    /*
    * Date类的成员方法
    * long getTime()把日期转换为毫秒（相当于System.currentTimeMillis())
    * 返回自1970年1月1日00:00:00 GMT 来以此Date对象表示的毫秒数
    * */
    private static void demo03(){
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }
    /*
    * Date类的带参构造方法：
    * Date(long date):传递的是毫秒值，把毫秒值转换为Date日期
    * */
    private  static void demo02(){
        Date d1 = new Date(0L);//时间原点
        System.out.println(d1);
        Date d2 = new Date(432342423);
        System.out.println(d2);
    }
    /*
    * Date类的空参数构造方法：
    *   Date()获取的就是当前系统的日期和时间
    * */
    private static void demo01(){
       Date date = new Date();
        System.out.println(date);
        System.out.println(date.toLocaleString());//当地时间格式
    }
}
