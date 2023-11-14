package day03.liuchengkongzhiyuju.ruguo;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/14
 * @time: 21:18
 * @function:
 * @since:
 * @version:
 * @description:判断语句3   - - -if else if else
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo03 {
    public static void main(String[] args) {
        /**
         * if语句三种格式  ：if else  if else
         *
         *
         * if(判断语句){
         *     执行语句1;
         * }else if(判断条件2){
         *     执行语句2;
         * }
         * .......
         * else if(判断条件n){
         *     执行语句n;
         * }else{
         *     执行语句n+1;
         * }
         *
         *
         *
         * 执行流程：
         *          首先判断关系表达式1看其结果是true还是false
         *          如果是true就执行语句
         *          如果是false就继续判断关系式2看其结果是true还是false
         *          如果是true就执行语句2
         *          如果是false就继续判断关系式.....看其结果是true还是false
         *          .......
         *          如果没有任何关系表达式为true，就执行语句体n+1
         */
        //x和y的关系满足如下:
        //x>=3      y=2x+1;
        //-1<=x<3       y=2x;
        //x<=-1     y=2x-1;
        //根据给定的x的数值，计算出y的值并输出
        //给定变量
        int x = 5;
        int y;
        if (x>=3) {
            y=2*x+1;
        }else if (x>=-1&&x<3){
            y=2*x;
        }else {
            y=2*x-1;
        }
        System.out.println("y的值是：" + y);


        /**
         * 制定成绩，判断学生等级
         *
         * 90-100       优秀
         * 80-89        好
         * 70-79        良
         * 60-69        及格
         * 60以下       不合格
         */
        int score = 100;
        if (score<0||score>100) {
            System.out.println("你的成绩是错误的");
        }else if (score>=90&&score<=100) {
            System.out.println("你的成绩属于优秀");
        }else if (score>=80&&score<=89) {
            System.out.println("你的成绩属于好");
        }if (score>=70&&score<=79) {
            System.out.println("你的成绩属于良");
    }if (score>=60&&score<=69) {
            System.out.println("你的成绩属于合格");
    }else {
            System.out.println("你的成绩属于不合格");
        }
    }
}
