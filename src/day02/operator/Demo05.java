package day02.operator;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/13
 * @time: 21:09
 * @function:
 * @since:
 * @version:
 * @description:三元运算
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo05 {
    public static void main(String[] args) {
        /**
         * 三元运算符格式
         *      数据类型 变量名  =  布尔表达式? 结果1:结果2
         *
         * 三元运算符计算方式
         *
         *      *布尔类型表达式结果为true，三元运算符整体结果为结果1，赋值给变量
         *      *布尔类型表达式结果为false，三元运算符整体结果为结果2，赋值给变量
         */
        int i = 1 == 2 ? 100 : 200;
        System.out.println(i);//200
        int j = 3 <= 4 ? 500 : 600;
        System.out.println(j);//500

    }
}
