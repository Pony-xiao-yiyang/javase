package day09.jicheng;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/23
 * @time: 18:21
 * @function:
 * @since:
 * @version:
 * @description:继承
 * @email ponyxiaoyiyang@gmail.com
 */
class Employee {
    String name;//定义name属性
    //定义员工的工作方法
    public void work(){
        System.out.println("尽心尽力的去工作");
    }
}

/**
 * 定义讲师类Teacher 继承员工类Employee
 *
 */
class Teacher extends Employee{
    //定义一个打印name的方法
    public void printName(){
        System.out.println("name=" + name);
    }
}

