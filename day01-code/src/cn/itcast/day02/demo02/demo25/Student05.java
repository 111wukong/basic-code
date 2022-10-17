package cn.itcast.day02.demo02.demo25;

import cn.itcast.day02.demo02.demo25.Student04;

public class Student05 {
    public static void main(String[] args) {
        Student04 stu1 = new Student04();
        stu1.setName("王国华");
        stu1.setAge(21);
        System.out.println("姓名：" + stu1.getName() +",年龄" + stu1.getAge());
        System.out.println("-------------------------------------------");
        Student04 stu2 = new Student04("彭于晏",22);
        System.out.println("姓名：" + stu2.getName() + ",年龄：" + stu2.getAge());
        stu2.setAge(88);
        System.out.println("姓名：" + stu2.getName() + ",年龄：" + stu2.getAge());
    }

}
