package cn.itcast.day01.demo03;
//求和

public class Demo02MethodSum {
    public static void main(String[] args) {
        System.out.println("结果是：" + getSum());
    }
    public static int getSum(){
        int sum = 0;
        for(int i = 0;i<100;i++){
            sum+= i;
        }
        return sum;
    }
}
