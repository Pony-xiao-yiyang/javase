package day07.scannerandrandomandarraylist.random;

import java.util.Random;
import java.util.Scanner;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/21
 * @time: 20:29
 * @function:
 * @since:
 * @version:
 * @description:随机生成1-100之间的整数，玩家猜测一个数字guessNumber，会与number作比较，系统会提示
 * 大了还是小了，知道玩家猜中，游戏结束
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo03 {
    public static void main(String[] args) {
        //系统产生一个随机数1-100的数
        Random random = new Random();
        int number = random.nextInt(100)+1;

        while (true){
            //键盘输入我们要猜的是数据
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入你要猜的数字（1-100）：");
            int guessNumber = scanner.nextInt();

            //比较这两个数据（用if语句）
            if (guessNumber > number) {
                System.out.println("你猜的数据" + guessNumber + "大了");
            }else if (guessNumber<number){
                System.out.println("你猜的数据" + guessNumber + "小了");
            }else {
                System.out.println("恭喜你，猜中了");
                break;
            }
        }
    }
}
