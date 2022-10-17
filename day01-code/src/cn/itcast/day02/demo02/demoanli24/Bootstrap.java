package cn.itcast.day02.demo02.demoanli24;

import cn.itcast.day02.demo02.red.OpenMode;
import cn.itcast.day02.demo02.red.RedPacketFrame;

public class Bootstrap {
    public static void main(String[] args) {
       MyRed red = new MyRed("红包案例");
       //设置群主名称
        red.setOwnerName("王国华");

        //普通红包
        NormalMode normal = new NormalMode();
        red.setOpenWay(normal);

        //手气红包
        OpenMode random = new RandomMode();
//        red.setOpenWay(random);
    }
}
