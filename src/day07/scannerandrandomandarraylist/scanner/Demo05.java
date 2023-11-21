package day07.scannerandrandomandarraylist.scanner;

import java.util.Scanner;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/21
 * @time: 20:18
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo05 {
    public static void main(String[] args) {
        //普通方式
       Scanner scanner= getScanner();
    }

    private static Scanner getScanner() {
        //普通方式
//        Scanner scanner = new Scanner(System.in);
//        return null;


        //匿名对象作为方法返回值
        return new Scanner(System.in);
    }
}
