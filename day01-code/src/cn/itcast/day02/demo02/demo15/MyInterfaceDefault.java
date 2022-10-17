package cn.itcast.day02.demo02.demo15;
/*
* 接口定义默认方法：
* 格式：
* public default 返回值类型 方法名称（参数列表）{
*       方法体
* }
* 备注：接口当中的默认方法，可以解决接口升级的问题。
* */
public interface MyInterfaceDefault {
    //抽象方法
    public abstract void  methodAbs();

    //新添加了一个抽象方法
//    public abstract void methodAbs2();

    //新添加的方法改成默认方法
    public default void methodDefault(){
        System.out.println("这是新添加的默认方法");
    }
}
