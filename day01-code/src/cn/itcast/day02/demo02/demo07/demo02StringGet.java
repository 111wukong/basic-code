package cn.itcast.day02.demo02.demo07;
/*
* String当中与获取相关的常用方法有：
* public int length():获取字符串当中含有的字符个数，拿到字符产长度。
* public string concat（String str）：将当前字符串和参数字符串拼接成为返回值新的字符串。、
* public char charAt(int index）：获取指定索引位置的单个字符串。（索引从0开始）
* public int indexOf（String str）：查找参数字符串在本字符串当中首次出现的索引位置，如果没有，则返回-1
* */
public class demo02StringGet {
    public static void main(String[] args) {
        String original = "HelloWorldHelloWorld";
        int index = original.indexOf("llo");
        System.out.println("第一次索引值是：" + index);
    }
}
