package cn.itcast.day02.demo02.demo04;
/*
Random类用来生成随机数字。使用为以下三个步骤：
1，导包：
import java.util.Random

2.创建：
Random r = new Random();//小括号当中留空即可

3.使用：
获取一个随机的int数字（范围是int的所有范围，有正负两种：
获取一个随机的int数字（参数代表范围，左闭右开区间）：int num  = r.Random(3):实际代表含义是：【0，3）

int num r.nextInt()
*/
import java.util.Random;
public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println("随机数字是：" + num);



    }
}
