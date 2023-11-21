package day07.scannerandrandomandarraylist.scanner;

import java.util.Scanner;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/21
 * @time: 19:59
 * @function:
 * @since:
 * @version:
 * @description:键盘输入两个数据之和
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo02 {
    public static void main(String[] args) {
        //创建对象
        Scanner scanner = new Scanner(System.in);
        //接收数据
        System.out.println("请输入第一个数据");
        double a = scanner.nextDouble();
        System.out.println("请输入第二个数据");
        double b = scanner.nextDouble();
        //对数据求和
        double c = a + b;
        System.out.println("数据之和为：" + c);
    }
}
