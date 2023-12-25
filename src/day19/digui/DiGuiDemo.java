package day19.digui;

/**
 * @author: Adolf.Linus
 * @date: 2023/12/25
 * @time: 20:34
 * @function:
 * @since:
 * @version:
 * @description:计算1 ~ n的和
 * @email ponyxiaoyiyang@gmail.com
 */
public class DiGuiDemo {
    //计算n的阶乘，使用递归完成
    public static void main(String[] args) {
        int n = 3;
        // 调用求阶乘的方法
        int value = getValue(n);
        // 输出结果
        System.out.println("阶乘为:"+ value);
    }
    /*
        通过递归算法实现.
        参数列表:int
        返回值类型: int
      */
    public static int getValue(int n) {
        // 1的阶乘为1
        if (n == 1) {
            return 1;
        }
      	/*
      	  n不为1时,方法返回 n! = n*(n-1)!
          递归调用getValue方法
      	*/
        return n * getValue(n - 1);
    }
}
