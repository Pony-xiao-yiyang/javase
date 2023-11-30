package day13.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/30
 * @time: 21:59
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo1Collection {
    public static void main(String[] args) {
        //创建集合对象
        //使用多态形式
        Collection<String> coll = new ArrayList<>();

        //使用方法
        //添加功能 boolean add(String s)
        coll.add("李思思");
        coll.add("蔡徐坤");
        coll.add("石破天");
        System.out.println(coll);

        //boolean contains(E e) 判断e是否在集合中存在
        System.out.println("判断  蔡徐坤  是否在集合中" + coll.contains("蔡徐坤"));


        //boolean remove(E e) 删除在集合中的e元素
        System.out.println("删除石破天" + coll.remove("石破天"));
        System.out.println("操作之后集合元素:" + coll);

        //size()    集合中有几个元素
        System.out.println("集合中有" + coll.size() + "个元素");

        //Object[]  toArray()转换成一个Object数组
        Object[] objects = coll.toArray();

        //遍历数组
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);//李思思    蔡徐坤
        }

        //void clear() 清空集合
        coll.clear();
        System.out.println("集合中内容为:" + coll);//集合中内容为:[]

        //boolean isEmpty() 判断是否为空
        System.out.println(coll.isEmpty());//true

    }
}
