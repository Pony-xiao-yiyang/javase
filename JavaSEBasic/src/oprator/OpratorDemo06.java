package oprator;

/**
 * @description:位运算
 * @author:
 * @time: 2022/11/2 20:52
 */
public class OpratorDemo06 {
    public static void main(String[] args) {
        /**
         * A = 0011 1100
         * B = 0000 1101
         *
         * A&B  0000 1100   0假1真 11为真 其余都为假
         * A|B  0011 1101   0假1真 00为假，其余为真
         * A^B  0011 0001   相同为0 不同为1
         * ~B   1111 0010   取反
         *
         * 2*8 = 16 2*2*2*2
         *
         * <<   *2          左移几位    2<<3    就是0000 0010 变成  0001 0000 左移3位
         * >>   /2          右移几位    16>>3    就是0001 0000 变成  0000 0010 左移3位
         * 0000 0000 0
         * 0000 0001 1
         * 0000 0010 2
         * 0000 0011 3      2*2^1+1
         * 0000 0100 4      2*2^1
         *
         * 0000 1000 8      2*2^2
         * 0001 0000 16     2*2^3
         */
        System.out.println(2<<3);
    }
}
