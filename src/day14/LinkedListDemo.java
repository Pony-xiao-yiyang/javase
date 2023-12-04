package day14;

import java.util.LinkedList;

/**
 * @author: Adolf.Linus
 * @date: 2023/12/4
 * @time: 21:12
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<>();
        //添加元素
        link.addFirst("adc1");
        link.addFirst("adc2");
        link.addFirst("adc3");
        System.out.println(link);

        //获取元素
        System.out.println(link.getFirst());
        System.out.println(link.getLast());

        //删除元素
        System.out.println(link.removeFirst());
        System.out.println(link.removeLast());

        while (!link.isEmpty()) {
            //判断集合是否为空
            System.out.println(link.pop());//弹出集合中的栈顶元素
        }
        System.out.println(link);
    }
}
