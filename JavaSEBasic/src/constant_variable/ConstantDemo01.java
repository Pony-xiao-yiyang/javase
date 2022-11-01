package constant_variable;

/**
 * @description:
 * @author:
 * @time: 2022/10/31 11:19
 */
public class ConstantDemo01 {

    //修饰符，不存在先后顺序
    static final double PI = 3.14;
    final static double Y = 10.1;

    public static void main(String[] args) {
        System.out.println(PI);
        System.out.println(Y);
    }
}
