package day09;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/23
 * @time: 20:58
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class Member extends User{
    public Member(){

    }

    public Member(String username, double leftMoney) {
        super(username, leftMoney);
    }

    //打开红包，就是从集合中，随机取出一份，保存到自己的余额中
    public void openHongBao(ArrayList<Double>list){
        //创建Random对象
        Random r = new Random();
        //随机生成一个角标
        int index = r.nextInt(list.size());
        //移除一个金额
        Double money = list.remove(index);
        //直接调用父类的方法，设置余额
        setLeftMoney(money);
    }
}
