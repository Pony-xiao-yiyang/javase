package day04.method;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/15
 * @time: 20:41
 * @function:
 * @since:
 * @version:
 * @description:方法重载
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo02 {
    public static void main(String[] args) {
        //定义不同数据类型的变量
        byte a = 10;
        byte b = 20;
        short c = 10;
        short d = 20;
        int e = 10;
        int f = 10;
        long g = 10;
        long h = 20;
        //调用
        System.out.println(compare(a,b));
        System.out.println(compare(c, d));
        System.out.println(compare(e, f));
        System.out.println(compare(g, h));
    }
    //两个long类型的
    private static boolean compare(long a, long b) {
        System.out.println("long");
        return a==b;
    }

    //两个int类型的
    private static boolean compare(int a, int b) {
        System.out.println("int");
        return a==b;
    }

    //两个short类型的
    private static boolean compare(short a, short b) {
        System.out.println("short");
        return a==b;
    }

    //两个byte类型的
    private static boolean compare(byte a, byte b) {
        System.out.println("byte");
        return a==b;
    }
}
