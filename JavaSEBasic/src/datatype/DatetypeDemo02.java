package datatype;

/**
 * @description:进制转换  浮点数拓展 字符拓展  转义字符  对象不一致  布尔值拓展
 * @author:
 * @time: 2022/10/25 20:28
 */
public class DatetypeDemo02 {
    public static void main(String[] args) {
        //整数拓展:     进制      二进制0b       十进制     八进制0        十六进制0x
        int i = 10;
        int i2 = 010;//八进制0
        int i3 = 0x10;//十六进制0x  0-9 A-F 16

        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);

        System.out.println("===========================");

        //浮点数拓展     有限的 离散 存在舍入误差 接近但不等于
        //float
        //double
        //BigDecimal    数学工具类(银行业务常用)
        float f = 0.1f;//0.1
        double d = 1.0/10;//0.1
        System.out.println(f == d);//false
        System.out.println(f);
        System.out.println(d);

        float d1    =   2312312313222f;
        float d2    =   d1+1;
        System.out.println(d1   ==  d2);

        System.out.println("==========================");
        //字符拓展 所有字符本质还是数字
        //编码 Unicode表： 97 = a 2字节 范围 0-65536 Excel表 2^16 = 65536
        char c1 = 'a';
        char c2 = '中';

        System.out.println(c1);
        System.out.println((int) c1);
        System.out.println(c2);
        System.out.println((int) c2);


        //U0000 UFFFF
        char c3 = '\u0061';
        System.out.println(c3);//a

        //转义字符
        //  \t      制表符
        //  \n      换行
        //.....
        System.out.println("Hello\tworld");//Hello	world
        System.out.println("Hello\nworld");

        System.out.println("========================");


        //对象不一致，前者新创建了一个对象（相当于在一个堆里新创建了两个栈，同堆不同栈），后者对象一致（同栈同堆）
        String sa = new String("hello,world");
        String sb = new String("hello,world");
        System.out.println(sa == sb);

        String sc = "hello world";
        String sd = "hello world";
        System.out.println(sc == sd);

        //布尔值拓展
        boolean flag    =   true;
        if (flag==true){
            System.out.println("hello.world");
        }
        //默认if语句中判断语句为真，Less is more，代码精简易读
        if (flag){
            System.out.println("helloworld");
        }

    }
}
