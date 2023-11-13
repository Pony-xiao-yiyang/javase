package day02.operator;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/13
 * @time: 19:12
 * @function:
 * @since:
 * @version:
 * @description:运算符
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo01 {
    public static void main(String[] args) {
        /**
         * 算法运算符包括
         *      +               加法运算
         *      -               减法运算
         *      *               乘法运算
         *      /               除法运算
         *      %               取模运算，两个数字相除取余数
         *      ++，--          自增自减运算
         */
        int i = 1234;
        System.out.println(i / 1000 * 1000);//计算结果为1000

        /**
         * ++运算，变量自己增长1，反之，变量自己减少1，用法和++一致
         *      *独立运算
         *          变量在独立运算时，前++和后++没有区别
         *          变量前++：eg:++i;
         *          变量后++：eg:i++;
         *
         * 混合运算：
         *      和其他变量放在一起，前++和后++就产生了不同
         *      变量 前++：变量a自己加1，将加1后的结果赋值给b，也就是说a先计算，a和b的结果都是2
         */
        int a = 1;
        int b = ++a;
        System.out.println(a);//计算结果为2
        System.out.println(b);//计算结果为1

        /**
         * 变量 后++：变量a1先把自己的值1，赋值给变量b1,此时变量b1的值就是1，变量a1自己的值就是1.
         * a1的结果就是2
         * b的值就是1.
         */
        int a1 = 1;
        int b1 = a++;
        System.out.println(a1);//结果是2;
        System.out.println(b1);//结果是1;

        /**
         *      +符号在遇到字符串的时候，表示连接，拼接的含义
         *      "a"+"b"的结果“ab”,连接含义
         */
        System.out.println("5+5=" + 5 + 5);//输出为5+5=55

    }
}
