package cn.itcast.day02.demo02.demo07;
/*题目要求：
键盘输入一个字符串，并且统计其中各种字符出现的次数
种类：大写字母，小写字母，数字，其他
* */

import java.util.Scanner;

public class Demo06StringCount {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input = sc.next();

        int counterUpper = 0;
        int counterLower = 0;
        int counterNumber = 0;
        int counterOther = 0;

        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];//当前单个字符
            if('A' <= ch&&ch<'Z'){
            counterUpper++;
        }else if('a'<= ch&&ch <='z'){
            counterLower++;
            }else if('0' <= ch&& ch <='9'){
                counterNumber++;
            }else{
                counterOther++;
            }
        }
        System.out.println("大写字母有：" + counterUpper);
        System.out.println("大写字母有：" + counterLower);
        System.out.println("大写字母有：" + counterNumber);
        System.out.println("大写字母有：" + counterOther);
    }
}
