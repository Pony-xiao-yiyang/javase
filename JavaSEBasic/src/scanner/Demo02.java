package scanner;

import java.util.Scanner;

/**
 * @author: Adolf.Linus
 * @date: 2023/1/5
 * @time: 16:15
 * @function:
 * @since:
 * @version:
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo02 {
    public static void main(String[] args) {
        //从键盘接收数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用nextLine方式接收：");

        //判断是否还有数据
        if (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            System.out.println("输入的内容为：" + str);
        }
        scanner.close();
    }
}
