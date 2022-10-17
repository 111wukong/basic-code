package cn.itcast.day02.demo02.demo05;
import java.util.ArrayList;
/*
* 数组的长度不可以发生改变
* 但是ArrayList集合长度是可以随意改变的。
*
* 对于ArrayList来说，有一个<E>代表范型。
* 范型：就是装在结合中的元素，全都是统一的什么类型。
* 注意：范型只能是引用类型，不能是基本类型。
* */

public class Demo05ArrayList {
    public static void main(String[] args) {
        //创建一个ArrayList集合，集合名称是list,里面装的全都是String字符串类型的数据
        //备注：从JDK1.7开始，右侧的尖括号内部可以不写内容，但是《》本身还是要写的
      ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        //向集合中添加一些数据，需要用到add方法
        list.add("王国华");
        System.out.println(list);
    }
}
