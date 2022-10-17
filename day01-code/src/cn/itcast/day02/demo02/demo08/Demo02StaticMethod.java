package cn.itcast.day02.demo02.demo08;
/*
* 一旦使用了static修饰成员方法，那么这就成为了静态方法，静态方法不属于对象，而是属于类的；
* 如果没有用static 关键字，那么必须创建对象，然后才能通过对象使用它。
*
* 无论是成员变量还是成员方法。如果有了static,都推荐使用类名称进行调用。
* 静态变量：类名称.静态变量
* 静态方法：类名称.静态方法（）
*
* 注意事项：
* 1，静态不能直接访问非静态。
* 原因：因为在内存中是先有静态内容的，后有非静态内容，
* 2，静态方法中不能用this。
* 原因：this代表当前对象，通过谁调用的方法。谁就是当前对象。
* */
public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass(); //首先创建对象
        //然后才能使用没有static关键字的内容；
        obj.method();
        //对于静态方法来说：可以通过对象名进行调用，也可以直接通过类名称进行调用。
        obj.methodStatic();//正确但不推荐，这种写法在编译之后也会被javac翻译成为”类名称.静态方法名“
        MyClass.methodStatic();//正确且推荐

        //对于本来当中的静态方法，可以省略名称
        myMethod();
        Demo02StaticMethod.myMethod();
    }
    public static void myMethod(){
        System.out.println("自己的方法！！！");
    }
}
