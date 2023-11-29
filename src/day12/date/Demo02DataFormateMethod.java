package day12.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/29
 * @time: 20:09
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo02DataFormateMethod {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy年mm月dd日");
        String str = "2018年12月11日";
        Date date= df.parse(str);
        System.out.println(date);//Thu Jan 11 00:12:00 CST 2018

    }
}
