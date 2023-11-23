package day09.jicheng;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/23
 * @time: 18:28
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class ExtenDemo01 {
    public static void main(String[] args) {
        //创建一个讲师类对象
        Teacher t = new Teacher();

        //为该员工类的name属性进行赋值
        t.name="小明";


        //调用该员工的printName()方法
        t.printName();//name = 小明

        //调用Teacher类继承来的work()方法
        t.work();//尽心尽力的工作
    }
}
