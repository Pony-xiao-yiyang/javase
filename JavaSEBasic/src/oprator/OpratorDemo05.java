package oprator;

/**
 * @description:逻辑运算符
 * @author:
 * @time: 2022/11/2 20:33
 */
public class OpratorDemo05 {
    public static void main(String[] args) {
        //与(and)    或(or)   非(取反)
        boolean a = true;
        boolean b = false;

        System.out.println("a  &&  b:"+(a  &&  b));//逻辑与运算：两个变量都为真，结果才为true
        System.out.println("a  ||  b:" + (a || b));//逻辑或运算：两个变量有一为真，结果才为true
        System.out.println("!(a &&  b):" + !(a && b));//逻辑非运算：如果为真，则为假，如果是假则结果为真


        //短路运算
        int c = 5;
        boolean d = (c < 4) && (c++ < 4);
        System.out.println(d);
        System.out.println(c);


    }
}
