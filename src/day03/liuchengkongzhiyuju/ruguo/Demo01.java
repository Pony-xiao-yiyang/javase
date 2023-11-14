package day03.liuchengkongzhiyuju.ruguo;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/14
 * @time: 21:06
 * @function:
 * @since:
 * @version:
 * @description:判断语句1 - if
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo01 {
    public static void main(String[] args) {
        /**
         * if语句第一种格式：if
         *
         *          if(关系表达式){
         *              语句体
         *          }
         *
         * 执行流程：
         *          首先判断关系表达式看其结果是true还是false
         *          如果是true就执行语句
         *          如果是false就不执行语句
         *
         */
        System.out.println("begin");
        //定义两个变量
        int a = 10;
        int b = 20;
        //变量使用if判断
        if (a==b) {
            System.out.println("a等于b");
        }
        int c = 10;
        if (a==c) {
            System.out.println("a等于c");
        }
        System.out.println("结果");
    }
}
