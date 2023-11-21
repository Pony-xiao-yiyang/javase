package day07.scannerandrandomandarraylist.arraylist;

import java.util.ArrayList;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/21
 * @time: 20:39
 * @function:
 * @since:
 * @version:
 * @description:ArrayList
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo01 {
    public static void main(String[] args) {
        //创建数组
        ArrayList<String> list = new ArrayList<>();

        //创建对象
        String s1 = "苍井空";
        String s2 = "三上悠亚";
        String s3 = "波多野结衣";

        //打印ArrayList集合
        System.out.println(list);

        //把对象作为元素添加到集合
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //打印Arraylist集合
        System.out.println(list);
    }
}
