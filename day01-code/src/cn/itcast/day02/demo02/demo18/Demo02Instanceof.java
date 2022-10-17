package cn.itcast.day02.demo02.demo18;
/*
* 如何才能知道一个父类引用的对象，本来是什么子类？
* 格式：
* 对象 instanceof 类名称
* 这将会得到哟个boolean值结果，也就是判断前面的对象能不能当作后面类型的实例。
* */
public class Demo02Instanceof {
    public static void main(String[] argsa) {
        Animal animal = new Cat();//本来是一只猫
        animal.eat();//猫吃鱼

        //如果希望调用子类特有的方法，需要向下转型
        //判断一下父类引用annimal本来是不是Dog
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
        //判断一下animal本来是不是Cat
        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
        giveMeAPet(new Dog());
    }
    public static void giveMeAPet(Animal animal){
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }

        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }
}
