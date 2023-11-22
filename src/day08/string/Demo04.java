package day08.string;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/22
 * @time: 21:16
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo04 {
    public static void main(String[] args) {
        String s = "aa|bb|cc";
        String[] strArray = s.split("|");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);//aa bb cc
        }
    }
}
