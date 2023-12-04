package day14;

import java.util.HashSet;

/**
 * @author: Adolf.Linus
 * @date: 2023/12/4
 * @time: 21:27
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class HashSetDemo02 {
    public static void main(String[] args) {
        //创建对象  该集合中储存 student类型对象
        HashSet<Student> stuSet = new HashSet<>();

        //储存
        Student stu = new Student("于谦", 43);
        stuSet.add(stu);
        stuSet.add(new Student("郭德纲",44));
        stuSet.add(new Student("于谦", 43));
        stuSet.add(new Student("郭麒麟",23));
        stuSet.add(stu);

        for (Student student : stuSet) {
            System.out.println(student);
        }
    }
}
