package day03.liuchengkongzhiyuju.whileyuju;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/14
 * @time: 22:36
 * @function:
 * @since:
 * @version:
 * @description:dowhile
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo02 {
    public static void main(String[] args) {
        int x= 1;
        do {
            System.out.println("helloworld"+x);
            x++;
        }while (x<=10);

        do {
            System.out.println("无条件的执行一次");
        }while (false);
    }
}
