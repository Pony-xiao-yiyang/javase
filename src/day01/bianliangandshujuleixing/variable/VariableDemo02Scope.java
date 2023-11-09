package day01.bianliangandshujuleixing.variable;

/**
 * @description:变量作用域
 * @author:
 * @time: 2022/10/31 10:20
 */
public class VariableDemo02Scope {
    static int allClicks = 0;//类对象
    String str = "hello,world";//实例对象

    public static void main(String[] args) {
        method();
    }

    private static void method() {
        int i = 0;//局部变量

    }
}
