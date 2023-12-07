package day17;

/**
 * @author: Adolf.Linus
 * @date: 2023/12/7
 * @time: 20:07
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class MyThread extends Thread{
    /*
     * 利用继承中的特点
     * 将线程名称传递 进行设置
     */
    public MyThread(String name){
        super(name);
    }
    /*
     * 重写run方法
     * 定义线程要执行的代码
     */
    @Override
    public void run(){
        for (int i = 0; i < 20; i++) {
//getName()方法 来自父亲

//getName()方法 来自父亲
            System.out.println(getName()+i);
        }
    }

}
