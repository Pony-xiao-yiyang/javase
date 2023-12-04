package day14;

import java.util.HashSet;

/**
 * @author: Adolf.Linus
 * @date: 2023/12/4
 * @time: 21:17
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class HashSetDemo {
    public static void main(String[] args) {
        //创建Set集合

        HashSet<String> set = new HashSet<String>();

        //添加元素
        set.add(new String("cba"));
        set.add("abc");
        set.add("bac");
        set.add("cba");

        //遍历
        for (String name : set) {
            System.out.println(name);
        }
    }
}
