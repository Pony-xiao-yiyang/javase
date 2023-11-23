package day09;

import java.util.ArrayList;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/23
 * @time: 20:42
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class QunZhu extends User{
    //添加构造方法
    public QunZhu(){

    }

    public QunZhu(String username, double leftMoney) {
        //通过super，调用父类构造方法
        super(username, leftMoney);
    }
    /*
    群主发红包，就是把一个整数的金额，分层若干等分
    1.获取群主余额，是否够发红包
        不能则返回null,并提示
        能则继续
    2.修改群主余额
    3.拆分红包
        3.1如果能整除，那么就平分
        3.2如果不能整除，那么就把余额分给最后一份

     */
    public ArrayList<Object> send(int money, int count){
        //获取群主余额
        double leftMoney = getLeftMoney();
        if (money>leftMoney){
            return null;
        }
        //修改群主余额
        setLeftMoney(leftMoney-money);

        //创建一个集合，保存等分金额
        ArrayList<Object> list = new ArrayList<>();

        //扩大100倍，想当于折算成"分"为单位，避免小数运算损失精度的问题
        money = money*100;

        //每份的金额
        int m = money / count;

        //不能整除的金额
        int l = money % count;

        //无论是否被整除，n-1份，都是每份的等额金额
        for (int i = 0; i < count; i++) {
            //缩小100倍，折算成“元”
            list.add(m/100.0);
        }

        //判断是否整除
        if (l == 0) {
            //能整除，最后一份金额，与之前每份金额一致
            list.add(m/100.0);
        }else {
            //不能整除，最后一份的金额，是之前的每份金额+余数金额
            list.add((m+1)/100.00);
        }
        //返回集合
        return list;
    }
}
