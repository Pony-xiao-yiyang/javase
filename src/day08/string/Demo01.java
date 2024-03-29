package day08.string;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/22
 * @time: 20:29
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo01 {
    public static void main(String[] args) {
        //创建字符串对象
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "HELLO";


        //boolean equals(Object obj):比较字符串的内存是否相同
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//false
        System.out.println("====================");

        //boolean equalsIgnoreCase(String str):比较字符串的内容是否相同，忽略大小写
        System.out.println(s1.equalsIgnoreCase(s2));//true
        System.out.println(s1.equalsIgnoreCase(s3));//true
        System.out.println("===========");
    }
}
