package oprator;

/**
 * @description:条件运算符
 * @author:
 * @time: 2022/11/3 22:44
 */
public class OpratorDemo07 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a+= b;  //a = a+b
        a-= b;  //a = a-b

        System.out.println(a);

        //字符串连接符 +  ,   String，从左到右运算
        System.out.println(a + b);
        System.out.println("" + a + b);//1020   开始为string类型，所以后面的a+b也是string类型
        System.out.println(a + b + "");//30     先开始a+b运算为30，后者为拼接
        System.out.println(a + b + "/t" + a + b);
    }
}
