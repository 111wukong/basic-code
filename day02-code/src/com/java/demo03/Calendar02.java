package com.java.demo03;

import java.util.Calendar;
import java.util.Date;

/*
* Calendar类的成员方法：
*   -public int get(int field):返回给定日历字段的值
*   -public void set(int field,int value):将给定的日历字段设置为给定值
*   -public abstract void add(int field,int amount):根据日历规则，为哦给定的日历字段添加或减去指定的时间量
*   -public Date getTime():返回一个表示此Calendar时间值（从历元到现在的毫秒 偏移量）的Date对象
* 成员方法的参数：
*   int field:日历类的字段，可以使用Calendar类的静态成员变量获取
*   public static final int YEAR = 1;年
*   public static final int MOUTH = 2;月
*   public static final int DATE = 5;月中的某一天
*   public static final int DATE_OF_MOUTH = 5;月中的某一天
*   public static final int HOUR = 10;时
*   public static final int MINUTE = 12;分
*   public static final int SECOND = 13;秒
* */
public class Calendar02 {
    public static void main(String[] args) {
        demo04();
    }
//    -public int get(int field):返回给定日历字段的值
//    参数：传递指定的日历字段（YEAR,MOUTH···）
//    返回值：日历字段代表具体的值。
    private  static void demo01(){
//        使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int  mouth = c.get(Calendar.MONTH);
        System.out.println(mouth+1);//这是西方的月份，只有0到11月
        int date = c.get(Calendar.DATE);
        System.out.println(date);
    }
//     -public void set(int field,int value):将给定的日历字段设置为给定值
//        参数：int field:传递指定的日历字段（YEAR)
//              int value:传递字段设置的具体值
    private static void demo02(){
        Calendar c = Calendar.getInstance();
//         设置年月日
        c.set(2000,4,8);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int  mouth = c.get(Calendar.MONTH);
        System.out.println(mouth+1);//这是西方的月份，只有0到11月
        int date = c.get(Calendar.DATE);
        System.out.println(date);
    }
//    -public abstract void add(int field,int amount):根据日历规则，为哦给定的日历字段添加或减去指定的时间量
//      参数：int field:传递指定的日历字段（YEAR)
//           int amount:增加或者减少的值
//              正数：增加   负数：减少
    private static void demo03(){
        Calendar c = Calendar.getInstance();
//        把年增加3
        c.add(Calendar.YEAR,3);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int  mouth = c.get(Calendar.MONTH);
        System.out.println(mouth+1);//这是西方的月份，只有0到11月
        int date = c.get(Calendar.DATE);
        System.out.println(date);
    }
//     -public Date getTime():返回一个表示此Calendar时间值（从历元到现在的毫秒 偏移量）的Date对象
//       把日历对象转换为日期对象
    private static void demo04(){
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);
    }
}
