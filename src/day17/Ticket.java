package day17;

/**
 * @author: Adolf.Linus
 * @date: 2023/12/7
 * @time: 20:33
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class Ticket implements Runnable{
    private int ticket = 100;
    /*
     * 执行卖票操作
     */
    @Override
    public void run() {
//每个窗口卖票的操作
//窗口 永远开启
        while (true) {
            if (ticket > 0) {//有票 可以卖
//出票操作
//使用sleep模拟一下出票时间
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
// TODO Auto‐generated catch block
                    e.printStackTrace();
                }
//获取当前线程对象的名字
                String name = Thread.currentThread().getName();
                System.out.println(name + "正在卖:" + ticket);
            }
        }
    }

}
