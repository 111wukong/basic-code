package cn.itcast.day02.demo02.demoanli19;

public class DemoMain {
    public static void main(String[] args) {
        //首先创建一个笔记本电脑
        Computer computer = new Computer();
        computer.powerOn();
        //准备一个鼠标供电脑使用
        //首先进行向上转型
        USB usbMouse = new Mouse(); //左父右子就是多态（左是接口，右是实现类也是多态）
        //参数是USB类型，正好传递进去的就是USB鼠标
        computer.useDevice(usbMouse);

        //另一种写法
        //创建一个USB键盘
        Keyboard keyboard = new Keyboard();//没有使用多态写法
        //方法参数是USB类型，传递进去的的是实现类对象
        computer.useDevice(keyboard);//正确写法！
        //使用子类对象，匿名对象，也可以。
        computer.useDevice(new Keyboard());//也是正确写法
        //对上的理解示列

        computer.powerOff();
        System.out.println("------------------------");
        method(10.0);
        method(20);
        int a = 30;
        method(a);
    }



    public static void method(double num){
        System.out.println(num);
    }


}
