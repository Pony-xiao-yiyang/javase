package day17;

/**
 * @author: Adolf.Linus
 * @date: 2023/12/7
 * @time: 20:28
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo01 {
    public static void main(String[] args) {
//创建自定义类对象 线程任务对象
        MyRunnable mr = new MyRunnable();
//创建线程对象
        Thread t = new Thread(mr, "小强");
        t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("旺财 " + i);
        }
    }

}
