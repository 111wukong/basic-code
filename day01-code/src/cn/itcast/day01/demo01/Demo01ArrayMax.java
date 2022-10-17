package cn.itcast.day01.demo01;

public class Demo01ArrayMax {
    public static void main(String[] args) {
        int[] array = {5,4,7,7,34,45,888,5345};
        int max = array[0];
        for(int i=1; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("最大值：" + max);
    }
}
