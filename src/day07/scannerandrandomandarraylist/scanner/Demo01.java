package day07.scannerandrandomandarraylist.scanner;
//import:包名.类名
import java.util.Scanner;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/21
 * @time: 19:46
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo01 {
    public static void main(String[] args) {
        //System.in系统输入指的是通过键盘录入数据
        /**
         * 创建键盘输入数据的对象
         */
        Scanner sc = new Scanner(System.in);
        //调用方法，接受数据
        System.out.println("请输入一个整数:");
        int i = sc.nextInt();
        //输出数据
        System.out.println("i:"+i);

    }
}
