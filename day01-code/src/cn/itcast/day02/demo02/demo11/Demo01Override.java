package cn.itcast.day02.demo02.demo11;
/*
* 方法覆盖重写的注意事项：
* 1。必须保证父子类之间的名称相同，参数列表也相同。
* 2.@Override:写在方法前面，用来检测是不是有效的正确覆盖。
* 这个注解就算不写，只要满足要求，也是正确的方法覆盖重写。
* 3，子类方法的返回值必须小于等于父类方法的返回值范围。
* 前提：java.lang.Object类是所有类的公共最高类（祖宗类）,java.lang.String就是Object的子类 。
* 4，子类方法的权限必须【大于等于】父类方法的权限修饰符。
* 扩展提示：public > protected > (default) > private
* 备注：（default）不是关键字default，而是什么都不写，留空。
*
* 子类必须调用父类构造方法 ，不写则赠送super()：写了则用写的指定的super调用，super只能有一个，还必须是一个。
* */


public class Demo01Override {
}
