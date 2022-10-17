package cn.itcast.day02.demo02.demo06;

import java.util.ArrayList;

public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student("洪七公",22);
        Student two = new Student("李白",55);
        Student three = new Student("杜甫",99);
        Student four = new Student("王国华",18);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName() + "，年龄：" + stu.getAge());
        }
    }
}
