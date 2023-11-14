package day03.liuchengkongzhiyuju.xuanzeyuju;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/14
 * @time: 21:51
 * @function:
 * @since:
 * @version:
 * @description:选择语句
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo01 {
    public static void main(String[] args) {
        /**
         * switch(表达式){
         *     case 常亮值1;
         *     语句体1;
         *     break;
         *     case 常亮值2;
         *     语句体2;
         *     break;
         *
         *     .....
         *
         *
         *     default:
         *     语句体n+1;
         *     break;
         * }
         *
         *
         * 执行流程：
         *          首先计算表达式
         *          其次，和case依次比较，一旦有对应的值，就会执行相对应的语句，在执行的过程中，遇到break就会结束
         *          最后，如果所有的case都和表达式的值不匹配，就会执行default语句体部分，然后程序结束掉。
         *
         */

        //定义变量，判断是星期几
        int weekday = 6;
        //switch语句实现选择
        switch (weekday) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
            case 6:
                System.out.println("星期六");
            case 7:
                System.out.println("星期天");
            default:
                System.out.println("你输入的数字有误");
                break;
        }
        //在switch语句中，表达式的数据类型，可以是byte,short,int,char,enum(枚举)，jdk7后可以接收字符串
    }
}
