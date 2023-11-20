package day06.leiyuduixiang;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/20
 * @time: 17:47
 * @function:
 * @since:
 * @version:
 * @description:对象使用
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo02 {
    /**
     * 创建对象
     * 类名 对象名  =  new 类名()
     *
     *
     * 使用对象访问类中的成员
     * 对象名.成员变量;
     * 对象名.成员方法();
     *
     */
    public static void main(String[] args) {
        //创建对象格式: 类名 对象名 = new 类名();
        Student s = new Student();
        System.out.println("s:" + s);//cn.itcast.Student@100363

        //直接输入成员变量值
        System.out.println("名字：" + s.name);
        System.out.println("年龄：" + s.age);
        System.out.println("==============");

    }
}
