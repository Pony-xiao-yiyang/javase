package day03.liuchengkongzhiyuju.xunhuanyuju;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/14
 * @time: 22:12
 * @function:
 * @since:
 * @version:
 * @description:for循环
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo02 {
    public static void main(String[] args) {
        /**
         * for循环语句格式
         *  for(初始化表达式 1 ;布尔表达式 2 ;步进表达式 4 ){
         *      循环体3
         *  }
         *
         *  执行流程：
         *          执行顺序：1234》234》234...2不满足为止
         *          1 负责完成循环变量初始化
         *          2 负责判断是否满足循环条件，不满足则跳出循环
         *          3 具体执行的雨具
         *          4 循环后，循环条件所涉及变量的变化条件
         */

        //循环改进，循环10次HelloWord
        //定义变量从0开始，循环条件为<10
        for (int i = 0; i < 10; i++) {
            System.out.println("HelloWorld"+i);
        }

        //循环练习：循环计算1-100之前的偶数和
        //1.先定义一个初始化变量，记录累加求和，初始值为0,
        int sum = 0;
        //2.利用for循环获取1-100之间的数字
        for (int i = 1; i <= 100; i++) {
            //3.判断获取的数组是奇数还是偶数
            if (i%2==0) {
                //4.如果在偶数就累加求和
                sum += i;

            }
        }
        //5.循环结束后，打印累加结果
        System.out.println("sum:" + sum);
    }
}
