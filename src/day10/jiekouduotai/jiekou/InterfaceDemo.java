package day10.jiekouduotai.jiekou;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/27
 * @time: 18:16
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        //创建子类对象
        Animal a = new Animal();
        //调用实现后的方法
        a.eat();
        a.sleep();
        a.fly();

    }
}
