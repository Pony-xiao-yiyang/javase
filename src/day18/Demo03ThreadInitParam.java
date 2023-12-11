package day18;

/**
 * @author: Adolf.Linus
 * @date: 2023/12/11
 * @time: 21:30
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo03ThreadInitParam {
    public static void main(String[] args) {
        Runnable task = new RunnableImpl();
        new Thread(task).start();
    }
}
