package cn.itcast.day01.demo02;
/*
注意事项：
对于有返回值的方法，可以单独调用，打印调用或者赋值调用。
但是对于没有返回值的方法，只能使用单独调用，不能使用打印调用或者赋值调用。
 */

public class Demo04MethodReturn {
    public static void main(String[] args) {
        //int num = getSum(109,66);
        //System.out.println("返回值是：" + num);
       // System.out.println(getSum(102,29));
        printSum(10,30);

    }
    public static int getSum(int a,int b){
        int result = a + b;
        return result;
    }
    public static void printSum(int a,int b){
        int result = a + b;
        System.out.println("结果是：" + result);
    }
}
