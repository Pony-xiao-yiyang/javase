package day08.string;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/22
 * @time: 21:00
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo03 {
    public static void main(String[] args) {
        //创建字符串对象
        String s = "abcde";


        //char[] toCharArray():把字符串转换为字符数组
        char[] chs = s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        }
        System.out.println("=================");

        //byte[] getBytes():把字符串转换为字节数组
        byte[] bytes = s.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("==============");


        //替换字母it为大写的IT
        String str = "itcast";
        String replace = str.replace("it", "IT");
        System.out.println(replace);
        System.out.println("=========");


    }
}
