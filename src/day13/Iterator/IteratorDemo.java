package day13.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/30
 * @time: 22:21
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class IteratorDemo {
    public static void main(String[] args) {
        //使用多态方式，创建对象
        Collection<String> coll = new ArrayList<>();

        //添加元素到集合
        coll.add("李思琦");
        coll.add("李思思");
        coll.add("菜思琦");

        //遍历数组
        //使用迭代器 遍历  每个集合对象都有自己的迭代器
        Iterator<String> it = coll.iterator();

        //  泛型指的是   迭代出 元素的数据类型
        while (it.hasNext()) {//判断是否有迭代元素
            String s = it.next();//获取迭代出的元素
            System.out.println(s);
        }
    }
}
