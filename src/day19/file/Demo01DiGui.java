package day19.file;

/**
 * @author: Adolf.Linus
 * @date: 2023/12/25
 * @time: 20:32
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo01DiGui {
    /**
     * * **递归**：指在当前方法内调用自己的这种现象。
     *
     * * **递归的分类:**
     *   - 递归分为两种，直接递归和间接递归。
     *   - 直接递归称为方法自身调用自己。
     *   - 间接递归可以A方法调用B方法，B方法调用C方法，C方法调用A方法。
     *
     * * **注意事项**：
     *   - 递归一定要有条件限定，保证递归能够停止下来，否则会发生栈内存溢出。
     *   - 在递归中虽然有限定条件，但是递归次数不能太多。否则也会发生栈内存溢出。
     *   - 构造方法,禁止递归
     * @param args
     */
    public static void main(String[] args) {
        // a();
        b(1);
    }

    /*
     * 3.构造方法,禁止递归
     * 编译报错:构造方法是创建对象使用的,不能让对象一直创建下去
     */
    public Demo01DiGui() {
        //Demo01DiGui();
    }


    /*
     * 2.在递归中虽然有限定条件，但是递归次数不能太多。否则也会发生栈内存溢出。
     * 4993
     * 	Exception in thread "main" java.lang.StackOverflowError
     */
    private static void b(int i) {
        System.out.println(i);
        //添加一个递归结束的条件,i==5000的时候结束
        if(i==5000){
            return;//结束方法
        }
        b(++i);
    }

    /*
     * 1.递归一定要有条件限定，保证递归能够停止下来，否则会发生栈内存溢出。 Exception in thread "main"
     * java.lang.StackOverflowError
     */
    private static void a() {
        System.out.println("a方法");
        a();
    }
}
