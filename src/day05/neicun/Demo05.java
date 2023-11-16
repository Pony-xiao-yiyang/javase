package day05.neicun;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/16
 * @time: 19:10
 * @function:
 * @since:
 * @version:
 * @description:数组空指针异常
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo05 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,};
        arr = null;
        //Exception in thread "main" java.lang.NullPointerException
        //	at day05.neicun.Demo05.main(Demo05.java:17)
        System.out.println(arr[0]);
    }
}
