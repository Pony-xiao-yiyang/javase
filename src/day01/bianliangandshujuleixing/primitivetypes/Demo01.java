package day01.bianliangandshujuleixing.primitivetypes;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/1
 * @time: 21:25
 * @function:
 * @since:
 * @version:
 * @description:数据类型
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo01 {
    public static void main(String[] args) {
        int i = 128;
        byte b = (byte) i;
        double c = i;
        /**
         * 强制转换 (类型)变量名     高--低
         * 自动转换     低---高
         */
        System.out.println(i);//128
        System.out.println(b);//-128    i最大值为127，内存溢出
        System.out.println(c);//128.0

        /**
         * 注意点：
         *
         * 			1.不能对Boolean进行转换
         *
         * 			2.不能把对象类型转换为不相干的类型
         *
         * 			3.在把高容量转换为低容量的时候，强制转换
         *
         * 			4.转换的时候可能存在内存溢出，或者精度问题
         */
        System.out.println("=======================");
        System.out.println((int) 23.7);
        System.out.println((int) -45.89f);


        System.out.println("=======================");
        char d = 'a';
        int v = d + 1;
        System.out.println(v);
        System.out.println((char) v);

    }
}
