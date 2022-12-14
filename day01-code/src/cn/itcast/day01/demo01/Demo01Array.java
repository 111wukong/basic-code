package cn.itcast.day01.demo01;
/*
*  数组的概念：是一种容器，可以同时存放多个数据值
* 数组的特点：
*1， 数组是一种引用数据类型
*2，数组中的多个数据，类型必须统一
*3，数组的长度在程序运行期间不可改变
*
*数组的初始化：在内存中创建一个数组，并向其中赋一些默认值。
* 两种常见的初始化方式：
* 1，动态初始化：指定长度
* 2，静态初始化指定内容
* 动态初始化数组的格式：
* 数据类型【】 数组名称 = new 数据类型【数组长度】;
* 静态初始化基本格式：
* 数据类型【】 数组名称 = new 数据类型【】{元素1，元素2，元素3，······};/
*  /省略格式：数据类型【】 数组格式 = {元素1，元素2，···}；
* 注意事项：
* 1.静态初始化没有直接指定长度，但任然会自动推算长度
* 2.静态初始化标准格式可以拆分为两个步骤：int[] arrayA;  arrayA = new int[]{1,2,3};
* 3.动态初始化也可以拆分两个步骤
* 4，静态初始化一旦使用省略格式，就不能拆分两个步骤
*
* 使用建议：如果不确定数组当中的具体内容，用动态初始化；否则，已经确定了具体内容的，用静态初始化。
*
* 直接打印数组名称：得到的是数数组对应的：内存地址哈希值。
* 访问数组元素的格式：数组名称【索引值】
*
* 使用动态初始化数组的时候，其中的元素将会自动拥有一个默认值，规则如下：
* 如果是整数类型：默认值为0
* 如果是浮点类型，默认值为0.0
* 如果是字符类型，默认值为’\u0000’
* 如果是布尔类型，默认值为false
*如果是应用类型，默认值为null
*
*
*
* java的内存需要划分为五个部分：
* 1.栈（stack):存放方法中的局部变量。方法的运行一定要在栈中运行。
* 2.堆（heap):凡是new出来的东西，都在堆当中。
*       堆里面的东西都有一个地址值：16进制
* 3.方法区（method area):存储.class的相关信息，包含方法的信息。
* 4.本地方法栈（native method stack):与操作系统相关。
* 5.寄存器（pc register):与cpu相关。
* */
public class Demo01Array {
    public static void main(String[] args) {
       /* int[] arrayA = new int[300];
        double[] arrayB = new double[10];
        String[] arrayC = new String[7];*/
        String[] arrayD = new String[]{"hello","world","java"};
        int[] arrayE = {10,20,30};
    }
}
