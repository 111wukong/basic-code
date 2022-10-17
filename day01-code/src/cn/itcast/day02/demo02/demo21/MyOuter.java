package cn.itcast.day02.demo02.demo21;

public class MyOuter {
    public void methodOuter(){
        int num = 10;//所在方法的局部变量


        class MyInner{
            public void methodInner(){
                System.out.println(num);
            }
        }
    }
}
