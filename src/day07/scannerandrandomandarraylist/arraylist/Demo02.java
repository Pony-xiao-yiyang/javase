package day07.scannerandrandomandarraylist.arraylist;

import java.util.ArrayList;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/21
 * @time: 20:51
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo02 {
    public static void main(String[] args) {
        //创建对象
        ArrayList<String> list = new ArrayList<>();

        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

//        public E get(int index):返回指定索引处的元素
        System.out.println("get:" + list.get(0));
        System.out.println("get:" + list.get(1));
        System.out.println("get:" + list.get(2));

//        public int size():返回集合中的元素的个数
        System.out.println("size:" + list.size());

//        public E remove(int index):删除指定索引处的元素，返回被删除的元素
        System.out.println("remove:" + list.remove(0));

//        遍历输出
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
