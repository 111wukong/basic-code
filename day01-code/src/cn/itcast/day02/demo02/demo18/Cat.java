package cn.itcast.day02.demo02.demo18;

public class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
    //子类特有方法
    public static void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
