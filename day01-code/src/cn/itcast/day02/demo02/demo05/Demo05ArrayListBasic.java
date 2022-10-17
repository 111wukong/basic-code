package cn.itcast.day02.demo02.demo05;
/*
* 如果希望向集合ArrayLiat当中存储基本类型数据，必须使用基本类型对应的“包装类”
*
* 基本类型           包装类（引用类型，包装类都位于java.lang包下）
* byte               Byte
* short              Short
* int                Integer     [特殊】
* long               Long
* float              Float
* double             Double
* char               Character    [特殊]
* boolean            Boolean
*
* 从jdk1.5开始，支持自动装箱，自动拆箱
* 自动装箱：基本类型----> 包装类型
* 自动拆箱：包装类型----> 基本类型
* */
import java.util.ArrayList;

public class Demo05ArrayListBasic {
    public static void main(String[] args) {
     ArrayList<Integer> listC = new ArrayList<>();
     listC.add(100);
     listC.add(399);
        System.out.println(listC);

    int num = listC.get(1);
        System.out.println("第一号元素是：" + num);

    }
}
