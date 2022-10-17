package cn.itcast.day01.demo01;
/*
* 一个方法可以有0，1多个参数；但是只能有0个或者1个返回值。
* 如果希望一个方法当中产生了多个结果数据作为返回：使用一个数组作为返回值类型即可。
* 任何数据类型都能作为方法的参数类型或者返回值类型。
*
* 数组作为方法的参数，传递进去的其实是数组的地址值
* 数组作为方法的返回值，返回的其实也是数组的的地址值
* */

public class Demo01ArrayReturn {
    public static void main(String[] args) {
        int[] result = calculate(10,20,39);
        System.out.println("总和：" + result[0]);
        System.out.println("平均值：" + result[1]);

    }
    public static int[] calculate(int a,int b,int c){
        int sum = a + b + c;
        int avg = sum / 3;
        //两个结果都希望进行返回
        //需要一个数组，数组可以保存多个结果
        /*
        * int[] array = new int[2];
        * array[0] = sum;
        * arrsy[1] = avg;
        * */
        int[] array = {sum,avg};
        return array;
    }
}
/*
* 下一节p96:面向对象*/
