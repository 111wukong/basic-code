package cn.itcast.day02.demo02.demo25;

import cn.itcast.day02.demo02.demo25.Student02;

public class Student03 {
    public static void main(String[] args) {
        Student02 stu1 = new Student02();//无参构造
        System.out.println("-------------");
        Student02 stu2 = new Student02("王国华",20);//全参构造
        System.out.println("姓名：" + stu2.getName()  + ",年龄:" + stu2.getAge());
        //如果需要改变对象当中的成员变量的数据内容，任然还需要使用setXxx方法
        stu2.setAge(23);
        System.out.println("姓名：" + stu2.getName()  + ",年龄:" + stu2.getAge());

    }
}
