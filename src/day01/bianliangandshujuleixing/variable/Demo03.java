package day01.bianliangandshujuleixing.variable;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/13
 * @time: 18:51
 * @function:
 * @since:
 * @version:
 * @description:变量
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo03 {
    public static void main(String[] args) {
        /**
         * java 的数据类型分为两大类
         *      基本数据类型：整数，浮点数，字符，布尔
         *      引用数据类型：类，数组，接口
         *
         *
         *     四类八种基本数据类型
         *          数据类型        关键字         内存占用        取值范围
         *          字节型         byte            1个字节        -128-127
         *          短数型         short           2个字节        -32768-32767
         *          整形          int(默认)        4个字节        -2,147,483,648 - 2,147,483,647
         *          长整数         long            8个字节        -2^63   -   2^63
         *          单精度         float           4个字节        1.40313E-45  -   3.4028E+38
         *          双精度         double          8个字节        4.9E-324 - 1.7977E+308
         *          字符型         char            2个字节        0-65535
         *          布尔类型        Boolean         1个字节        ture,false
         *
         *
         *          java中默认类型：整数类型为int,浮点类型是double
         *
         */
        //八大数据类型

        //整数
        Integer integer =   1;//包装类
        Byte byte1 =  1;
        int     num1    =   10;//最常用
        byte    num2   =   20;
        short   num3  =   30;
        long    num4    =   30L;//Long类型要在数字后面加L

        //小数，浮点数
        float num5  =   40.2f;
        double num6 =   1.1314d;

        //字符
        char name = 'A';

        //字符串,string不是关键字，类
        String name1    =   "adolf";

        //布尔值
        boolean flag = true;
        boolean flag1 = false;
    }
}
