package cn.itcast.day01.demo01;
/*
* 所有的引用类型变量，都可以赋null值.但是代表其中什么也没有。
* 数组必须进行new
*初始化才能使用其中的元素，如果只是赋值了一个null,没有进行new创建。将会发生空指针异常：NullPointerException。 */

public class Demo01ArrayNull {
    public static void main(String[] args) {
        int[] arrsy = null;
        System.out.println(arrsy[0]);
    }
}
