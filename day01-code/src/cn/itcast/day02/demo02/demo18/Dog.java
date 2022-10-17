package cn.itcast.day02.demo02.demo18;

public class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("狗吃屎");
    }
    public void watchHouse(){
        System.out.println("狗看家");
    }
}
