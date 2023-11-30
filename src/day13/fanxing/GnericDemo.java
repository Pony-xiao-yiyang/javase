package day13.fanxing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/30
 * @time: 22:37
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class GnericDemo {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add("abc");
        coll.add("itcast");
        coll.add(5);//由于集合没有做任何限定，任何类型都可以给其中存放
        Iterator it = coll.iterator();
        while (it.hasNext()) {
            //需要打印每个字符串的长度,就要把迭代出来的对象转成String类型
            String str = (String) it.next();
            System.out.println(str.length());//java.lang.ClassCastException
        }
    }
}
