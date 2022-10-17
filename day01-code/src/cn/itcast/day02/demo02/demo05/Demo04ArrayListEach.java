package cn.itcast.day02.demo02.demo05;

/*
*
* ArrayList<int> list = new ArrayList<>();//错误写法，因为范型（只能是引用类型）里面不能存放基本类型，基本类型是没有地址值的
* */

import java.util.ArrayList;

public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("王国华1");
        list.add("王国华2");
        list.add("王国华3");
        
        //遍历集合：
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            
        }
    }
}
