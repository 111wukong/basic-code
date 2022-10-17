package cn.itcast.day02.demo02.demoanli24;

import cn.itcast.day02.demo02.red.OpenMode;

import java.util.ArrayList;

public class NormalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney,final int totalCount) {
    ArrayList<Integer> list = new ArrayList<>();

    int avg = totalMoney / totalCount; //平均数
    int mod = totalMoney % totalCount; //余数

        //注意totalCount-1代表最后一个先留着
        for (int i = 0; i < totalCount - 1; i++) {
            list.add(avg);
        }
        //有零头，需要放在最后一个红包发当中
        list.add(avg + mod);
        return list;
    }
}
