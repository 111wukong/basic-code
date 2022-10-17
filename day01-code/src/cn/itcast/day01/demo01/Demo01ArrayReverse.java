package cn.itcast.day01.demo01;

import java.util.jar.JarOutputStream;

public class Demo01ArrayReverse {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        //遍历数组本来的样子
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println("------------------");
        /*
        * 初始化语句：int main = 0,max = array.length -1
        * 条件判断：min < max
        * 步进表达式：min++,max--
        * 循环体：用三个变量到手
        * */
        for(int min = 0, max = array.length - 1; min < max; min++, max--){
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        //再次打印遍历输出数组后来的样子
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
