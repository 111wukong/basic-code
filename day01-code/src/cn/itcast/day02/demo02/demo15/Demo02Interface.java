package cn.itcast.day02.demo02.demo15;
//对于类，方法来说，abstract关键字和final关键字不能同时使用，因为矛盾。
public class Demo02Interface {
    public static void main(String[] args) {
        //创建实现类对象
        MyInterfaceDefaultB a = new MyInterfaceDefaultB();
        a.methodAbs();//调用抽象方法，实际运行的是右侧实现类。
        //调用默认方法，如果实现类当中没有，会向上找接口
        a.methodDefault();
    }


}
