package cn.itcast.day02.demo02.demoanli14;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);
        Member one = new Member("成员A",1);
        Member two = new Member("成员B",13);
        Member three = new Member("成员C",31);
        Member four = new Member("成员D",3);
        manager.show();
        one.show();
        two.show();
        three.show();
        four.show();

        System.out.println("--------------------------------");
        //群主发了20快红包，分成3个红包
        ArrayList<Integer> redList = manager.send(20,4);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);
        four.receive(redList);

        manager.show();
        one.show();
        two.show();
        three.show();
        four.show();
    }
}
