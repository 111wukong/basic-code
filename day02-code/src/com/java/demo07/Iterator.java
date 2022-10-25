package com.java.demo07;
/*
* java.util.Iterator接口.迭代器（在没有索引的集合就不能用for进行遍历，所以只能用迭代器对集合进行遍历）
*       有两个常用的方法：
*   boolean hasNext()如果仍有元素可以迭代，则返回true。
*       判断集合中还有没有下一个元素，有就返回true，没有就返回false
*   E next（）:返回迭代的下一个元素。
*       取出集合中的下一个元素
*   Iterator迭代器，是一个接口，我们无法使用，需要使用Iterator接口的实现类对象，获取实现类的方法比较特殊
*   Collection接口中有一个方法，叫iterator（），这个方法返回的就是迭代器的实现类对象。
*       Iterator<E> itrator() 返回在此 collection的元素上进行迭代的迭代器
*
*   迭代器的使用步骤（重点）
*       1，使用集合中的方法iterator（），获取迭代器的实现类对象，使用Iterator接口接收（多态）
*       2，使用Iterator接口中的方法hasNext判断还有没有下一个元素
*       3，使用Iterator接口中的方法next取出集合中的下一个元素
* */

import java.util.ArrayList;
import java.util.Collection;

public class Iterator {
    public static void main(String[] args) {
        //创建一个集合对象
        Collection<String> coll = new ArrayList<>();
        coll.add("王国华");
        coll.add("蒋明源");
        coll.add("姚明");
        coll.add("科比");
        coll.add("詹姆斯");
        coll.add("麦迪");
//        使用集合中的方法iterator（），获取迭代器的实现类对象，使用Iterator接口接收（多态）
//        注意：Iterator<E>接口 也是有范型的，迭代器的范型跟着集合走，集合是什么范型，迭代器就是什么范型
        java.util.Iterator<String> it = coll.iterator();
//        boolean b = it.hasNext();//使用Iterator接口中的方法hasNext判断还有没有下一个元素
//        System.out.println(b);
//        String s = it.next();//使用Iterator接口中的方法next取出集合中的下一个元素
//        System.out.println(s);
//        b = it.hasNext();
//        System.out.println(b);
//        s = it.next();
//        System.out.println(s);
//        b = it.hasNext();
//        System.out.println(b);
//        s = it.next();
//        System.out.println(s);
//        b = it.hasNext();
//        System.out.println(b);
//        s = it.next();
//        System.out.println(s);
//        b = it.hasNext();
//        System.out.println(b);
//        s = it.next();
//        System.out.println(s);
//        b = it.hasNext();
//        System.out.println(b);
//        s = it.next();
//        System.out.println(s);
//        b = it.hasNext();
//        System.out.println(b);
//        s = it.next();//没有元素，再取出元素就会抛出NoSuchElementException没有元素异常
//        System.out.println(s);

        /*代码优化：
        * 发现使用迭代器取出集合中的元素的代码是一个重复性的过程，所以我们可以使用循环优化。
        * 不知道集合中有多少元素，使用while循环（知道循环次数用for循环）
        * 循环结束条件：hasNext方法返回false。
        * */
        while (it.hasNext()){
            String e = it.next(); 
            System.out.println(e);
        }
        System.out.println("----------------");
        //使用for循环
//        for(Iterator it2 = (Iterator) coll.iterator(); it2.hasNext();){
//            String e = it2.next();
//            System.out.println(e);
//        }

    }
}
