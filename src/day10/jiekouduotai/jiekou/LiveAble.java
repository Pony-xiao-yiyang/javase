package day10.jiekouduotai.jiekou;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/27
 * @time: 18:09
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public interface LiveAble {
    //定义抽象方法
    public abstract void eat();

    public abstract void sleep();

    public default void fly(){
        System.out.println("天上飞");
    }
    default void fun(){
        fun1();
        fun2();
    }

    private void fun1(){
        System.out.println("跑起来");
    }

    private void fun2(){
        System.out.println("跑起来");
    }
}
