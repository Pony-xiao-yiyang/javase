package day14;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Adolf.Linus
 * @date: 2023/12/4
 * @time: 20:53
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class ListDemo {
    public static void main(String[] args) {
        //创建List集合对象
        List<String> list = new ArrayList<>();

        //往 尾部添加 指定元素

        list.add("图图");
        list.add("小美");
        list.add("不高兴");

        System.out.println(list);

        //add(int index,String s)   往指定位置添加

        list.add(1,"没头脑");

        //String remove(int index)删除指定位置元素  返回被删除元素
        //删除索引位置为2的元素
        System.out.println("删除索引位置为2的元素");
        System.out.println(list.remove(2));

        System.out.println(list);

        //String get(int index)     获取指定位置元素

        //跟size()   方法一起使用  来遍历数组
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //还可以使用增强for
        for (String string : list) {
            System.out.println(string);
        }
    }
}
