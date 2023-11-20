package day06.leiyuduixiang;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/20
 * @time: 18:14
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class TestPhone {
    public static void main(String[] args) {
        Phone phone = new Phone();

        //输出成员变量
        System.out.println("品牌： " + phone.brand);//null
        System.out.println("颜色： " + phone.color);//null
        System.out.println("价格： " + phone.price);//0
        System.out.println("============");

        //给成员变量赋值
        phone.brand="nike";
        phone.price=10;
        phone.color="yellow";

        //再次输入成员变量值
        System.out.println("品牌： " + phone.brand);//nike
        System.out.println("颜色： " + phone.color);//yellow
        System.out.println("价格： " + phone.price);//10
        System.out.println("============");
        System.out.println("==============");

        //调用成员方法
        phone.call("Jason");
        phone.sentMessage();


    }
}
