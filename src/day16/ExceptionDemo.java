package day16;

/**
 * @author: Adolf.Linus
 * @date: 2023/12/6
 * @time: 21:01
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        int[] arr = { 34, 12, 67 };
        int num = ArrayTools.getElement(arr, 4);
        System.out.println("num=" + num);
        System.out.println("over");//ArrayIndexOutOfBoundsException

    }
}
