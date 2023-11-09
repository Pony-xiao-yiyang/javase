package day02.shujuleixing;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/9
 * @time: 20:32
 * @function:
 * @since:
 * @version:
 * @description:数据类型之自动转换
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo01 {
    /*
    范围小的类型向范围大的类型提升，byte,short,char,运算直接提升为int。
        byte,short,char----->>int--->>long---->>float---->>double
     */
    public static void main(String[] args) {
        int i = 1;
        byte b = 2;
//        byte x = b + i;//报错
        //int类型和byte类型运算，结果是int类型
        int j = b + i;
        System.out.println(j);


        int i1 = 2;
        double d = 2.5;
        //int类型和double类型运算，结果是double 类型
        //int类型会被提升为double类型
        double e = d + i1;
        System.out.println(e);
    }
}
