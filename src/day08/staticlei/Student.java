package day08.staticlei;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/22
 * @time: 21:28
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class Student {
    private String name;
    private int age;
    //学生id
    private int sid;
    //类变量，记录学生数量，分配学号
    public static  int numberOfStudent = 0;

    public Student(String name, int age, int sid) {
        this.name = name;
        this.age = age;
        //通过 numberOfStudent给学生分配学号
        this.sid = ++numberOfStudent;
    }

    //打印属性值
    public void show(){
        System.out.println("Student: name" + name + ",age" + age + ",sid=" + sid);
    }
}
