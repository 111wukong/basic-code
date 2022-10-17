package com.java.demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class excerse {
    public static void main(String[] args) throws ParseException {
        demo01();
    }
    public static void demo01() throws ParseException {
        System.out.println("请输入出生日期 (yyyy-MM-dd):");
        String birthday = new Scanner(System.in).next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdaydate = sdf.parse(birthday);
        Date date = new Date();
//      把date格式的出生日期转化为毫秒值（只有毫秒值才能相加减）
        long birthdayDateTime = birthdaydate.getTime();
        long time = date.getTime();
        long text = time - birthdayDateTime;
        System.out.println(text);
        //把毫秒值转换为天（s/1000/60/60/24)
        System.out.println(text/1000/60/60/24);
//        String text01 = sdf.format(text);
//        System.out.println(text01);



    }

}
