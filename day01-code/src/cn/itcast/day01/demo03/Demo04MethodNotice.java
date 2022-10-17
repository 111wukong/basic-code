package cn.itcast.day01.demo03;

/*
* 使用方法的注意事项：
* 1，方法应该定义在类中，不能在方法中定义方法，不能嵌套。
* 2，方法定义的先后顺序无所谓
* 3，方法定义后不会执行，若需要执行，一定要调用：单独调用，打印调用，赋值调用。
* 4，如果方法有返回值，必须写上：“return 返回值;,不能没有。
* 5，return后面的返回值，必须和方法的返回值类型对应
* 6，对于一个void没有返回值的方法，不能写return后面的返回值，只能写return自己。
* 7，对于一个void方法最后一行的return可以省略不写
* 8，一个方法中可有多个return语句，但是必须保证同时只有一个会被执行，两个return不能连写
* * */
public class Demo04MethodNotice {
    public static void main(String[] args) {

    }
    public static int method1(){
        return 10;
    }
    public static void method2(){
       // return 10;//错误的写法，方法没有返回值，return后面就不能写返回值。
        return;//没有返回值,只是结束执行而已。
    }
    public static void method3(){
        System.out.println("aaaa");
        System.out.println("bbbb");
        return;//最后一行的return可以不写。
    }
}
