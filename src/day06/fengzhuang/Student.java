package day06.fengzhuang;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/20
 * @time: 18:27
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class Student {
    //成员变量
    private String name;
    private int age;

    //无参构造
    public Student() {
    }

    //有参构造
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
