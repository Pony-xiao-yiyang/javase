package day07.scannerandrandomandarraylist.random;

import java.util.Random;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/21
 * @time: 20:21
 * @function:
 * @since:
 * @version:
 * @description:Random
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo01 {
    public static void main(String[] args) {
        //创建键盘输入数据的对象
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            //随机生成一个数据
            int number = random.nextInt();
            //输出数据
            System.out.println("number:" + number);
        }
    }
}
