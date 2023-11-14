package day03.liuchengkongzhiyuju;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/14
 * @time: 20:55
 * @function:
 * @since:
 * @version:
 * @description:顺序控制
 * @email ponyxiaoyiyang@gmail.com
 */
public class ShunXuKongZhiDemo01 {
    /*
            在一个程序执行的过程中，各条语句的执行顺序对程序的结果是有直接影响的
            也就是说，程序的的流程对运行结果有直接的影响。所以，我们必须知道每条语句的的执行流程。而且，很多时候我们要通过控制语句的执行顺序
            来实现我们要完成的功能
     */
    public static void main(String[] args) {
        //顺序执行,根据编写的顺序，从上到下运行
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
    }
}
