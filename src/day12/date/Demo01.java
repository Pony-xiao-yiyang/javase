package day12.date;

import java.util.Date;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/29
 * @time: 19:56
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo01 {
    public static void main(String[] args) {
        //创建日期对象，把当前的时间
        System.out.println(new Date());//Wed Nov 29 19:57:17 CST 2023
        //创建日期对象，把当前的毫秒数转换成日期对象
        System.out.println(new Date(0L));//Thu Jan 01 08:00:00 CST 1970
    }
}
