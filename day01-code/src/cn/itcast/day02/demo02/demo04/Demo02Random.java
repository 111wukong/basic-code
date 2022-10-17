package cn.itcast.day02.demo02.demo04;
import java.util.Random;
public class Demo02Random {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(10);
            System.out.println("输出的随机数字为："+ num);
        }
    }

}
