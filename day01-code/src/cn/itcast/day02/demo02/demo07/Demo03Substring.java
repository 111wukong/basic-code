package cn.itcast.day02.demo02.demo07;
 /*
 * 字符串的截取方法：
 * public String substring(int index):截取从参数位置开始一直到字符串末尾，返回新字符串。
 * public String substring(int begin,int end):截取从bejin开始，一直到end结束，中间的字符串。
 * 备注：【begin，end),包含左边，不包含右边。
 * */

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Demo03Substring {
    public static void main(String[] args) {
        String str1 = "Helloworld";
        String str2 = str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);

        String str3 = str1.substring(4,7);
        System.out.println(str3);
        System.out.println("----------------");
        //下面这种写法，字符串的内容任然没有改变的
        //下面有两个字符串：”Hello","java“
        //strA中保存的是地址值
        //本来的地址值是Hello的0x666，后来地址值变成了Java的0x999d
        String strA = "Hello";
        System.out.println(strA);
        strA = "jAVA";
        System.out.println(strA);
    }
}
