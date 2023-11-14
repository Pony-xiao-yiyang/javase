package day03.liuchengkongzhiyuju.ruguo;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/14
 * @time: 21:47
 * @function:
 * @since:
 * @version:
 * @description:if语句和三元运算符的互换
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo04 {
    public static void main(String[] args) {
        /**
         * 在某些简单的应用中，if语句是可以和三元运算符互换使用的
         */
        int a = 10;
        int b = 20;
        //定义变量，保存a和b的较大值
        int c;
        if (a>b) {
            c=a;
        }else {
            c=b;
        }
        //可以上述功能改写为三元运算符形式
        c=a>b?a:b;
        System.out.println(c);
    }
}
