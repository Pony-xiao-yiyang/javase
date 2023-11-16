package day05.neicun;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/16
 * @time: 19:08
 * @function:
 * @since:
 * @version:
 * @description:数组越界
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo04 {
    public static void main(String[] args) {
        int[]arr = { 1,2,3 };
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
        //	at day05.neicun.Demo04.main(Demo04.java:16)
        System.out.println(arr[3]);
    }
}
