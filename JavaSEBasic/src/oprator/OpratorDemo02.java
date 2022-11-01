package oprator;

/**
 * @description:运算符
 * @author:
 * @time: 2022/11/1 22:01
 */
public class OpratorDemo02 {
    public static void main(String[] args) {
        long a = 12312312323L;
        int b = 123;
        short c = 10;
        byte d = 8;


        //没有long类型时，所有非int类型的都转为int类型
        System.out.println(a + b + c + d);//long
        System.out.println(b + c + d);//Int
        System.out.println(c + d);//Int
    }
}
