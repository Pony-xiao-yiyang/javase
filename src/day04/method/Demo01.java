package day04.method;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/15
 * @time: 20:07
 * @function:
 * @since:
 * @version:
 * @description:方法
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo01 {
    public static void main(String[] args) {
        /**
         * 在所需的课程中，使用过嵌套循环输出矩阵，控制台打印出矩阵就可以了，因此将方法定义为void，没有返回值
         * 在主方法main中直接被调用
         *
         *
         * print()方法被main方法调用后直接输出结果，而main方法并不需要print方法的执行结果，所以被定义为void。
         *
         *
         *
         *
         * 修饰符 返回值类型 方法名(){
         * //代码省略
         * return 结果;
         * }
         *
         * 修饰符  public static
         * 返回值类型    表示方法运行的结果的数据类型，方法执行后将结果返回到调用者
         * 参数列表     方法在运算过程中的未知数据，调用者调用方法时传递
         * return      将方法执行后的结果带给调用者，方法执行到return，整体方法运行结束
         *
         * ps:return结果：这里的“结果”在开发中，我们正确的叫法成为方法的返回值
         */
        print();
        //调用方法getSum，传递两个整数，这里传递的实际数据又称为实际参数
        //并接收方法计算后的结果，返回值
       int sum =getSum(5,6);
        System.out.println(sum);

        //调用方法compare()，传递两个整数，这里传递的实际数据又称为实际参数
        //并接收方法计算后的结果，布尔值
        boolean bloo   =   compare(3,8);
        System.out.println(bloo);

        /**
         * 计算1+2+3+....+100的和
         */
        //调用方法getSum1（）
        //并接收方法计算后的结果，整数
        int sum1=getSum1();
        System.out.println(sum1);

        /**
         * 调用方法的三种形式
         *  1.直接调用
         *  2.赋值调用
         *  3.输出语句调用
         */
    }

    /**
     * 定义计算1+2+3+...100的求和方法
     * 返回值类型。计算结果整数int
     * 参数：没有不确定数据
     * @return
     */
    private static int getSum1() {
        //定义变量保存求和
        int sum1 = 0;
        //从1开始循环，到100结束
        for (int i = 0; i <=100; i++) {
            sum1=sum1+i;
        }
        return sum1;
    }


    /**
     * 定义比较两个整数是否相同的方法
     * 返回值类型，比较的结果布尔类型
     * 参数   不确定参与比较的两个整数
     * @param a
     * @param b
     * @return
     */
    private static boolean compare(int a, int b) {
        if (a==b) {
            return true;
        }else {
            return false;
        }
    }

    /**
     * 定义计算两个整数的方法
     * 返回值类型，计算结果是int
     * 参数   不确定数据求和，定义int参数，参数又称为形式参数
     * @param a
     * @param b
     * @return
     */
    private static int getSum(int a, int b
    ) {
        return a+b;
    }

    private static void print() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
