package cn.itcast.day01.demo04;
/*
* 对于功能类似的方法来说，因为参数列表不一样，却需要记住那麽多的不同方法名称，太麻烦。
* 方法的重载（overload）：多个方法名称一样，但是参数列表不一样。
* 好处：只需要记住唯一一个方法名称，就可以实现多个类似的功能。
* */

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Demo01MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4));

    }
    public static int sum(int a,int b){
        System.out.println("有两个参数的方法执行！");
        return a+b;
    }
    public static int sum(int a,int b,int c,int d){
        System.out.println("有四个参数的方法执行！");
        return a + b + c + d;
    }

}
