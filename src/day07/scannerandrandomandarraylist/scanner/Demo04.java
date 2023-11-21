package day07.scannerandrandomandarraylist.scanner;

import java.util.Scanner;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/21
 * @time: 20:15
 * @function:
 * @since:
 * @version:
 * @description:匿名对象1
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo04 {
    public static void main(String[] args) {
        //普通模式

        Scanner scanner = new Scanner(System.in);
        input(scanner);

        //匿名对象作为方法接收的参数
        input(new Scanner(System.in));
    }

    private static void input(Scanner scanner) {
        System.out.println(scanner);
    }
}
