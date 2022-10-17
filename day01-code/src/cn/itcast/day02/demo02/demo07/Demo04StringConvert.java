package cn.itcast.day02.demo02.demo07;
/*
* String当中与转换相关的常用方法有：
* public char[] toCharArray():将当前字符串拆分成为字符数组字符数组作为返回值。
* public byte[] getBytes():获取当前字符串底层的字节数组。
* public String replace(CharSequence oldString,CharSequence newString);
* 将所有出现的老字符串替换成为新的字符串，返回替换之后的结果新字符串。
* 备注：CharSequence意思就是说可以接收字符串类型。
*
* */
public class Demo04StringConvert {
    public static void main(String[] args) {
        //转换成为字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("--------------");
        //转换为字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        //字符串的内容替换(游戏语言过滤)
        String str1 = "How do you do?";
        String str2 = str1.replace("o","*");
        System.out.println(str1);
        System.out.println(str2);

    }
}
