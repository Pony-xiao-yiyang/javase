package day03.liuchengkongzhiyuju.xuanzeyuju;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/14
 * @time: 22:02
 * @function:
 * @since:
 * @version:
 * @description:case的穿透性
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo02 {
    public static void main(String[] args) {
        /**
         * 在switch语句中，如果case的后面不写break，将出现穿透现象，
         * 也就是不会在判断下一个case的值，直接向后运行，直到遇到break，或者整体switch结束
         */
        int i = 5;
        switch (i) {
            case 0:
                System.out.println("执行case 0");
                break;
            case 5:
                System.out.println("执行case 5");
            case 10:
                System.out.println("执行case 10");
            default:
                System.out.println("执行default");
        }
    }
}
