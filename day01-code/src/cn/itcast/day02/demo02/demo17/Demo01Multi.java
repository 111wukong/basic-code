package cn.itcast.day02.demo02.demo17;
/*
* 代码中多态的体现:其实就是一句话；父类引用指向子类对象。
* 格式；
* 父类名称 对象名 = new 子类名称（）;
* 或者：
* 接口名称 对象名 = new 实现类名称（）;
*
*
* */

public class Demo01Multi {
    public static void main(String[] args) {
        //使用多态的写法,对象的向上转型，其实就是多态写法。
        //向上转型一定是安全的，从小范围转向了大范围，
        //左侧父类的引用，指向右侧子类的对象
        Fu obj = new Zi();
        obj.method();
        obj.methodFu();
    }
}
