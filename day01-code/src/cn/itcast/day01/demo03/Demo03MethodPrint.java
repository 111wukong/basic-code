package cn.itcast.day01.demo03;

public class Demo03MethodPrint {
    public static void main(String[] args) {
        printCount(10);

    }
    public static void printCount(int num){
        for(int i = 1; i<num;i++)
            System.out.println("helloworld"+i);
    }
}
//下次看p72 方法的注意事项