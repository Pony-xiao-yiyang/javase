package day12.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/29
 * @time: 20:00
 * @function:
 * @since:
 * @version:
 * @description:format方法，parse方法
 * @email ponyxiaoyiyang@gmail.com
 */
public class DateFormat {
    public static void main(String[] args) {
        Date date = new Date();
        //对应的日期格式为：2023-03-29 20:03:23
        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        //2023年11月29日
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy年MM月dd日");

        String str = format.format(date);
        String str1 = format1.format(date);
        System.out.println(str);
        System.out.println(str1);
    }
}
