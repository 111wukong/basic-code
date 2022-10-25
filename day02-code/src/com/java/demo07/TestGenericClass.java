//package com.java.demo07;
//
//public class TestGenericClass(E) {
//    public static void main(String[] args) {
//        //不写范型默认为Object类型
//        GenericClass gc = new GenericClass();
//        gc.setName("只能是字符串");
//        Object obj = gc.getName();
//
//        //创建GennericClass对象，范型使用Integer类型
//        GenericClass<Integer> gc2 = new GenericClass<>();
//        gc2.setName(1);
//
//        Integer name = gc2.getName();
//        System.out.println(name);
//
//        //创建GennericClass对象，范型使用String类型
//        GenericClass<String> gc3 = new GenericClassK<>();
//        gc3.setName("小明");
//        String name1 = gc3.setName();
//        System.out.println(name1);
//
//    }
//}
