package day07.scannerandrandomandarraylist.scanner;

import java.util.Scanner;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/21
 * @time: 20:04
 * @function:
 * @since:
 * @version:
 * @description:键盘输入三个数据并获取最大值
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo03 {
    public static void main(String[] args) {
        //创建对象
        Scanner scanner = new Scanner(System.in);
        //接收对象
        System.out.println("请输入第1个数据：");
        double a = scanner.nextDouble();
        System.out.println("请输入第2个数据：");
        double b = scanner.nextDouble();
        System.out.println("请输入第3个数据：");
        double c = scanner.nextDouble();

        //如何获取三个数据的最大值
        double d = a > b ? a : b;
        double max = d > c ? d : c;
        System.out.println("max为：" + max);

    }
}
