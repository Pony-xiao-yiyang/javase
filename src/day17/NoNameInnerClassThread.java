package day17;

/**
 * @author: Adolf.Linus
 * @date: 2023/12/7
 * @time: 20:30
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class NoNameInnerClassThread {
    public static void main(String[] args) {
// new Runnable(){
// public void run(){
// for (int i = 0; i < 20; i++) {
// System.out.println("张宇:"+i);
// }
// }
// }; //‐‐‐这个整体 相当于new MyRunnable()
        Runnable r = new Runnable(){
            @Override
            public void run(){
                for (int i = 0; i < 20; i++) {
                    System.out.println("张宇:"+i);
                }
            }
        };
        new Thread(r).start();
        for (int i = 0; i < 20; i++) {
            System.out.println("费玉清:"+i);
        }
    }

}
