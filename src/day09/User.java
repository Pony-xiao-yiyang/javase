package day09;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/23
 * @time: 20:38
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class User {
    //成员变量
    private String username;//用户名
    private double leftMoney;//余额

    //构造方法

    public User() {
    }

    public User(String username, double leftMoney) {
        this.username = username;
        this.leftMoney = leftMoney;
    }

    //get and set

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(double leftMoney) {
        this.leftMoney = leftMoney;
    }

    //展示信息的方法
    public void show(){
        System.out.println("用户名：" + username + ",余额为：" + leftMoney + "元");
    }
}
