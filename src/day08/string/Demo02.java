package day08.string;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/22
 * @time: 20:41
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo02 {
    public static void main(String[] args) {
        //创建字符串对象
        String s = "helloworld";

        //int length():获取字符串长度，其实也就是字符个数
        System.out.println(s.length());
        System.out.println("===========");

//        String concat(String str):将指定的字符串连接到该字符串的末尾

        String s2 = s.concat("**hello world**");//helloworld**hello world**
        System.out.println(s2);

//        char charAt(int index):获取指定索引处的字符
        System.out.println(s.charAt(0));//h
        System.out.println(s.charAt(1));//e
        System.out.println("==========");

//        int indexOf(String str):获取str在字符串对象中第一次出版的索引，没有返回-1
        System.out.println(s.indexOf("i"));//-1
        System.out.println(s.indexOf("owo"));//4
        System.out.println(s.indexOf("ak"));//-1
        System.out.println("=====================");

        //String substring(int start):从start开始截取字符串到字符串结尾
        System.out.println(s.substring(0));//helloworld
        System.out.println(s.substring(5));//world
        System.out.println("================");

        //String substring(int start , int end ):从start到end截取字符串。含start，不含end
        System.out.println(s.substring(0, s.length()));//helloworld
        System.out.println(s.substring(3, 8));//lowor
    }
}
