package cn.itcast.day01.demo02;
/*
方法的使用。
定义格式：
public static void 方法名称（）{
        方法体
}
调用格式：
方法名称（）;
注意事项：
1，方法定义的先后顺序无所谓
2，方法定义必须是挨着的
3，定义方法后，自己是不会执行的，如果希望执行，一定要进行方法的调用。
 */
public class Demo02Method {
    public static void main(String[] args) {
        printMethod();
    }


    public static void printMethod(){
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 20; i++) {
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
