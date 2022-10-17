package com.java.demo02;
import sun.java2d.pipe.SpanShapeRenderer;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateFormat {
    /*
    * java.text.Dateformat:是日期/时间格式化子类的抽象类
    * 作用：格式化（也就是日期->文本）.解析（文本——>日期）
    * 成员方法：
    * String format(Date date)按照指定模式，把Date日期，格式化为符合模式的字符串
    * Date parse（String souce）把符合模式的字符串解析为Date日期
    * DateFormat是一个抽象类，无法直接创建对象使用，可以使用DateFFormat的子类
    *
    * 构造方法：
    *   SimpleDateFormat(String pattern)用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat.
    *   参数：
    *       String pattern:传递指定的模式
    *   模式：区分大小写的
    *       y  年        d  日
    *       M  月        H  时
    *   写对应的模式，会把模式替换为对应的日期和时间
    *   “yyyy-MM-dd  HH:mm:ss"
    *   "yyyy年MM月dd日  HH时mm分ss秒
    * */
    public static void main(String[] args) throws ParseException {
        demo02();
    }
    /*
    * 使用DateFormat类中的方法format,把日期格式化为文本
    * String format(Date date),按照指定格式，把Date日期格式化为符合模式的字符串
    * 使用步骤：
    *   1，创建SimpleDateFormat对象，构造方法中传递指定的模式
    *   2，调用SimpleDateFormat对象中的format，按照构造方法中指定的模式，把date日期转化为符合模式的字符串（文本）
    * */

    private static  void demo01(){
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd天  HH时:mm分:ss秒");
        Date date = new Date();
        String  text = sdf.format(date);
        System.out.println(date);
        System.out.println(text);
    }
    /*
    * 使用DateFormat类中的方法parse,把文本解析为日期
     *Date parse（String source),按照指定格式，把符合模式的字符串解析为Date日期
     * 使用步骤：
     *   1，创建SimpleDateFormat对象，构造方法中传递指定的模式
     *   2，调用SimpleDateFormat对象中的parse，按照构造方法中指定的模式，把date日期转化为符合模式的字符串（文本）
     * 注意：
     *      public Date parse(String source) throws ParseException
     *  parse方法声明了一个异常叫ParseException（解析异常）、
     * 如果字符串与构造方法的模式不一样，那么这个程序就会抛出异常
     * 调用一个抛出异常的方法，及必须处理这个异常，要么throws继续声明抛出这一个异常。要么try····catch自己处理这个异常
    * */
    private static void demo02() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd天  HH时:mm分:ss秒");
        Date date = sdf.parse("2022年10月14天  20时:38分:13秒");
        System.out.println(date);
    }
}
