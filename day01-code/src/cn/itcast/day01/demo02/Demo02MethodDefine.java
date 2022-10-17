package cn.itcast.day01.demo02;
/*
方法就是若干语句功能的集合。
方法定义了，必须要进行调用才能使用。
定义方法的完整格式：
修饰符  返回值类型  方法名称（参数类型 参数名称，。。。）{

  方法体
  return 返回值
    }
方法的三种调用格式：
1，单独调用:方法名称（参数）
2，打印调用：System.out.println(方法名称（参数））
3，赋值调用：数据类型 变量名称 = 方法名称（参数）
注意：此前学习的方法，返回值类型固定写为void，这种方法只能单独调用，不能进行打印调用或者赋值调用
     */

public class Demo02MethodDefine {
    public static void main(String[] args) {
       //单独调用
        sum(190,20);
        System.out.println("==========");
        //打印调用
        System.out.println(sum(10,02));
        System.out.println("==========");
        //赋值调用
        int number = sum(10,20);
        System.out.println("变量的值："+number);
    }
    public static int sum(int a,int b) {
        System.out.println("方法执行了");
        int result = a + b;
        return result;
    }
}
