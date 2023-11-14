package day03.liuchengkongzhiyuju.ruguo;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/14
 * @time: 21:11
 * @function:
 * @since:
 * @version:
 * @description:判断语句2-if....else
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo02 {
    public static void main(String[] args) {
        /**
         * if语句第二种格式:if....else
         *
         *
         * if(关系表达式){
         *     语句体1;
         * }else{
         *     语句体2;
         * }
         *
         * 执行流程：
         *          首先先判断关系表达式看其结果是true还是false
         *          如果是true就执行语句体1;
         *          如果是false就执行语句体2
         */

        //判断给定的数据是否是奇数还是偶数
        //定义变量
        int a = 1;
        if (a % 2 == 0) {
            System.out.println("a是偶数");
        }else {
            System.out.println("a是奇数");
        }
        System.out.println("结束");
    }
}
