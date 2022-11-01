package oprator;

/**
 * @description:运算符
 * @author:
 * @time: 2022/11/1 22:11
 */
public class OpratorDemo03 {
    public static void main(String[] args) {
        //关系运算符返回的结果：正确，错误      布尔值
        int a = 10;
        int b = 20;
        int c = 21;

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);
        //取余，模运算
        System.out.println(c % a); //c / a 21 / 10 = 2...1
    }
}
