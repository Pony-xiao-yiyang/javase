package day10.jiekouduotai.jiekou;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/27
 * @time: 18:13
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class Animal implements LiveAble {
    @Override
    public void eat() {
        System.out.println("吃东西");
    }

    @Override
    public void sleep() {
        System.out.println("晚上睡");

    }

    @Override
    public void fly(){
        System.out.println("自由自在的飞行");
    }
}
