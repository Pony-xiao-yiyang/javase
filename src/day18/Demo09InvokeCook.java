package day18;

/**
 * @author: Adolf.Linus
 * @date: 2023/12/11
 * @time: 21:37
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo09InvokeCook {
    public static void main(String[] args) {
        // TODO 请在此使用Lambda【省略格式】调用invokeCook方法
        invokeCook(() -> System.out.println("吃饭啦！"));
    }

    private static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}
