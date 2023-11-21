package day07.scannerandrandomandarraylist.random;

import java.util.Random;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/21
 * @time: 20:24
 * @function:
 * @since:
 * @version:
 * @description:获取1-n之间的随机数，包括n
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo02 {
    public static void main(String[] args) {
        int i = 50;
        //创建对象
        Random random = new Random();
        //获取随机数
        int number = random.nextInt(i) + 1;
        //输出随机数
        System.out.println("随机数：" + number);
    }
}
