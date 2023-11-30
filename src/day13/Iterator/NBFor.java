package day13.Iterator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/30
 * @time: 22:31
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class NBFor {
    public static void main(String[] args) {
        Collection<String>coll = new ArrayList<String>();
        coll.add("小黑伞");
        coll.add("梅川内酷");
        coll.add("日川刚坂");

        //使用增强for变量
        for (String s : coll) {//接收变量s代表    代表被遍历到的集合元素
            System.out.println(s);

        }
    }
}
