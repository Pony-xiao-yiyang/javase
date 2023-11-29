package day12.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/29
 * @time: 20:13
 * @function:
 * @since:
 * @version:
 * @description:练习1
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo02 {
    public static void main(String[] args) throws ParseException {
            System.out.println("请输入出生日期 格式 YYYY-MM-dd");
            // 获取出生日期,键盘输入
            String birthdayString = new Scanner(System.in).next();
            // 将字符串日期,转成Date对象
            // 创建SimpleDateFormat对象,写日期模式
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            // 调用方法parse,字符串转成日期对象
            Date birthdayDate = sdf.parse(birthdayString);
            // 获取今天的日期对象
            Date todayDate = new Date();
            // 将两个日期转成毫秒值,Date类的方法getTime
            long birthdaySecond = birthdayDate.getTime();
            long todaySecond = todayDate.getTime();
            long secone = todaySecond-birthdaySecond;
            if (secone < 0){
                System.out.println("还没出生呢");
            } else {
                System.out.println(secone/1000/60/60/24);
            }
        }
    }

