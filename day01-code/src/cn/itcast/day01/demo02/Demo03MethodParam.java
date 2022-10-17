package cn.itcast.day01.demo02;
/*
*
*
*
*
*  */

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Demo03MethodParam {
    public static void main(String[] args) {
        method1(1,2);

        System.out.println("===========");
        method2();
    }
    //有两个数字相乘，做乘法，必须知道各自的数字是多少，否则无法进行计算。
    //有参数
    public static void method1(int a,int b){
        int result = a * b;
        System.out.println("结果是:"+ result);
    }
    //例如打印输出10次文本字符串
    public static void method2(){
        for(int i = 0; i < 10; i++){
            System.out.println("helloworld"+i);
        }
    }
}

