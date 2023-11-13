package day02.operator;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/13
 * @time: 20:51
 * @function:
 * @since:
 * @version:
 * @description:比较运算符
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo03 {
    public static void main(String[] args) {
        /**
         * 比较运算符
         *      ==      比较符号两边数据是否相等，相等结果就是true
         *      <       比较符号左面的数据是否小于右面的的数据，如果小于结果就是true
         *      >       比较符号左面的数据是否大于右面的的数据，如果大于结果就是true
         *      <=      比较符号左面的数据是否小于或者等于右面的的数据，如果小于或者等于结果就是true
         *      >+      比较符号左面的数据是否大于或者等于右面的的数据，如果大于或者等于结果就是true
         *      !=      不等于符号，如果符号两边的数据不相等，结果为true
         *
         *
         *  比较运算符，是两个数据之间进行比较的运算，运算结果都是布尔值true或者false。
         *
         */
        System.out.println(1 == 1);//true
        System.out.println(1 < 2);//true
        System.out.println(3 > 4);//false
        System.out.println(3 <= 4);//true
        System.out.println(3 >= 4);//false
        System.out.println(3 != 4);//true

    }
}
