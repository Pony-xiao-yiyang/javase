package day03.liuchengkongzhiyuju.whileyuju;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/14
 * @time: 22:27
 * @function:
 * @since:
 * @version:
 * @description:While 语句
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo01 {
    public static void main(String[] args) {
        //while循环实现打印10次HelloWord
        //定义初始化变量
        int i = 1;
        //循环条件<=10
        while (i <= 10) {
            System.out.println("HelloWorld");
            //步进
            i++;
        }
        //while循环计算1-100的和
        //使用while循环实现
        //定义一个变量，记录累加求和
        int sum = 0;
        //使用while循环让初始化表达式的值变化
        while (i <= 100) {
            sum += i;
            //步进表达式改变变量的值
            i++;
        }
        //打印求和的变量
        System.out.println("1-100的和是：" + sum);
    }
}
