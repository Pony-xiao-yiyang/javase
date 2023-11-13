package day02.operator;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/13
 * @time: 20:46
 * @function:
 * @since:
 * @version:
 * @description:赋值运算符
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo02 {
    public static void main(String[] args) {
        /**
         * 赋值运算符
         *      =           等于号
         *      +=          加等于
         *      -=          减等于
         *      *=          乘等于
         *      /=          除等于
         *      %=          取模等
         *
         * 赋值运算符，就是将符号右面的值，赋值给左面的变量
         */
        int i = 5;
        i+=5;//计算方式 i=i+5 变量i先加5，再赋值变量
        System.out.println(i);//结果是10;

    }
}
