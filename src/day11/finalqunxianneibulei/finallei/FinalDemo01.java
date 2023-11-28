package day11.finalqunxianneibulei.finallei;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/28
 * @time: 19:46
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class FinalDemo01 {
    public static void main(String[] args) {
        //声明变量，使用final修饰
        final int a;
        //第一次赋值
        a = 10;
        //第二次赋值
//        a = 20;//报错，不可重新赋值

        //声明变量，直接赋值，使用final修饰
        final int b = 10;
        //第二次赋值
//        b = 20;//报错，不可重新赋值

//        final int c  = 0;
        for (int i = 0; i < 10; i++) {
            final int c  = i;
            System.out.println(c);
        }
    }
}
