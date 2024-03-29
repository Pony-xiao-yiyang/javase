package day18;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author: Adolf.Linus
 * @date: 2023/12/11
 * @time: 21:34
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo06Comparator {
    public static void main(String[] args) {
        // 本来年龄乱序的对象数组
        Person[] array = {
                new Person("古力娜扎", 19),
                new Person("迪丽热巴", 18),
                new Person("马尔扎哈", 20) };

        // 匿名内部类
        Comparator<Person> comp = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        Arrays.sort(array, comp); // 第二个参数为排序规则，即Comparator接口实例

        for (Person person : array) {
            System.out.println(person);
        }
    }
}
