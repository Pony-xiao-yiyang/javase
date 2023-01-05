package scanner;

import java.util.Scanner;

/**
 * @author: Adolf.Linus
 * @date: 2023/1/5
 * @time: 16:50
 * @function:
 * @since:
 * @version:
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //和
        double sum = 0;
        //计算输入了多少个数字
        int m = 0;

        //通过循环判断是否还有输入，并在里面对每一次进行求和统计
        while (scanner.hasNextFloat()) {
            double x = scanner.nextDouble();
             m = m + 1;//m++
             sum = sum + x;
        }
        System.out.println(m + "个数的和为：" + sum);
        System.out.println(m + "个数的平均值是" + (sum / m));

        scanner.close();
    }
}
