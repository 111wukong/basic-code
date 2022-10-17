package com.java.demo01;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }

    /*
    * 直接打印对象对象的地址值没有意义，需要重写object类的toString方法
    * 直接打印对象的属性（name,age)
    * */
    /*
    * @override
    * public String toString(){
    * //return "abc";
    * return "Person{name = "+name+",age = "+age+"};
    * }
    * */
//    @Override
//    public String toString(){
//        return "Person{"+
//                "name='"+ name + '\''+
//                ",age=" + age +
//                '}';
//    }

    /*
    * Object类的equals方法默认比较的就是两个对象的地址值，没有意义
    * 所以我们需要重写equals方法，比较两个对象得属性值（name，age）
    *   对象的属性值一样好，返回true，否则返回false
    *       存在问题：隐含着一个多态
    * object obj = p2 = new Person("王国华“，18）；
    * 多态弊端：无法使用子类特有的内容（属性，方法）
    * 解决方法：可以使用向下转型（强转）把object类型转化为Person
    * */

//        @Override
//        public boolean equals(Object obj){
//            //使用向下转型（强转）把Object类型转化为Person
//            Person p = (Person)obj;
//            //比较两个对象的属性，一个是调用方法的this（P1),一个就是p（obj=p2)
//            boolean b = this.name.equals(p.name) && this.age==p.age;
//            return b;
//        }

    @Override
    public boolean equals(Object obj){
        //增加一个判断传递的参数Obj是this本身，直接返回true，提高程序效率
        if(obj == this){
            return true;
        }
        //增加一个判断，传递的参数obj是null。直接返回false，提高程序效率
        if(obj == null){
            return false;
        }
        /*
        * 增加一个判断，是Person类型在转化，防止类型类型转换异常ClassCastException
        * */
        if(obj instanceof Person){
            //使用向下转型（强转）把Object类型转化为Person
            Person p = (Person)obj;
            //比较两个对象的属性，一个是调用方法的this（P1),一个就是p（obj=p2)
            boolean b = this.name.equals(p.name) && this.age==p.age;
            return b;
        }
        //不是Person类型直接转换false
        return false;
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
