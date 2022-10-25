package com.java.demo06;

import javax.swing.*;
import java.awt.*;

public class DFrame extends JFrame {
    JTextField t;
    JTextArea area;
    JButton btn1,btn2;
//搭建窗口
public DFrame(String title,int x, int y,int width,int height) {
    //实例化组件
    t=new JTextField (15);
    btn1=new JButton("求平方");
    btn2=new JButton("清除");
    area=new JTextArea(15,40);

    //布局窗口
    this.setLayout(new FlowLayout());
    this.add(t);
    this.add(btn1);
    this.add(btn2);
    this.add(area);

    //监听器的绑定
    DListener lis=new DListener(this);
    btn1.addActionListener(lis);
    btn2.addActionListener(lis);

    //设置窗口自身属性
    this.setTitle(title);
    this.setBounds(x, y, width, height);
    this.setVisible(true);
}
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new DFrame("计算平方",100,100,300,260);


    }
}
