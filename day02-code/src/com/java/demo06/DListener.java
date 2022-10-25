package com.java.demo06;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DListener implements ActionListener {
    DFrame f;
    JButton btn;

    public DListener(DFrame f) {
        this.f = f;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        btn = (JButton) e.getSource();
        if (btn == f.btn1) {
            //获取文本框中的字符串
            String s = f.t.getText();
            //转换
            double d = Double.parseDouble(s);
            //输出到文本域中
            //f.area.setText(d+"的平方为："+d*d);
            f.area.append(d + "的平方为：" + d * d + "\n");
            f.t.setText("");
        }
        if (btn == f.btn2) {
            f.area.setText("");
            f.t.setText("");

        }

    }
}