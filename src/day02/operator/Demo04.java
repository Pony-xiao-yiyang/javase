package day02.operator;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/13
 * @time: 20:58
 * @function:
 * @since:
 * @version:
 * @description:逻辑运算符
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo04 {
    public static void main(String[] args) {
        /**
         * 逻辑运算符
         *      &&短路与
         *              1.两边是true，结果就是true
         *              2.一边是false，结果就是false
         *              短路特点：符号左边是false，右面不再运算
         *      ||短路或
         *              1.两边都是false，结果就是false
         *              2.一边是true，结果就是true
         *              3短路特点：符号左面是true，右面不再运算
         *      ！取反
         *              1.!true结果是false
         *              2.!true结果是true
         *
         *
         * 逻辑运算符，是用来连接两个布尔类型结果的运算符，运算结果都是布尔值true或者false
         *
         */

        System.out.println(true && true);//true
        System.out.println(true && false);//false
        System.out.println(false && true);//false,右面不计算

        System.out.println(false || false);//false
        System.out.println(false || true);//true
        System.out.println(true || false);//true,右面不计算

        System.out.println(!false);//true

    }
}
