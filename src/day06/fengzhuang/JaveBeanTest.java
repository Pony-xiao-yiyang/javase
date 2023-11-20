package day06.fengzhuang;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/20
 * @time: 18:38
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class JaveBeanTest {
    public static void main(String[] args) {
        //无参构造使用
        Student student = new Student();
        student.setName("Ikun");
        student.setAge(2);
        System.out.println(student.getName() + "----" + student.getAge());

        System.out.println("==============");

        //有参构造
        Student student1 = new Student("彭丽锦", 18);
        System.out.println(student1.getName() + "......" + student1.getAge());
    }
}
