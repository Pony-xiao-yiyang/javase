/**
 * @description:
 * @author:
 * @time: 2022/10/31 10:28
 */
public class VariableDemo03 {

    //类变量   static
    static double salary = 2500;

    //属性，变量

    //实例变量：从属于对象：如果不自行初始化，这个类型默认值 0 0.0
    //布尔值：默认值是false
    //除了基本类型，其余的默认值都是null
    String name;
    int age;


    static {

    }

    //main方法
    public static void main(String[] args) {

        //局部变量
        int i = 10;
        System.out.println(i);

        //变量类型  变量名字 = new VariableDemo03();
        VariableDemo03 variableDemo03 = new VariableDemo03();
        System.out.println(variableDemo03.age);//0
        System.out.println(variableDemo03.name);//null

        //类变量 static
        System.out.println(salary);
    }

    //其他方法
    public void add(){


    }
}
