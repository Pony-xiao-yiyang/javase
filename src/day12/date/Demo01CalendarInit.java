package day12.date;

import java.util.Calendar;
import java.util.Date;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/29
 * @time: 20:19
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo01CalendarInit {
    public static void main(String[] args) {
        // 创建Calendar对象
        Calendar cal = Calendar.getInstance();
        // 设置年
        int year = cal.get(Calendar.YEAR);
        // 设置月
        int month = cal.get(Calendar.MONTH) + 1;
        // 设置日
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年" + month + "月" + dayOfMonth + "日");

        System.out.println("==========================");
        // 使用add方法
        cal.add(Calendar.DAY_OF_MONTH, 2); // 加2天
        cal.add(Calendar.YEAR, -3); // 减3年
        System.out.println(year + "年" + month + "月" + dayOfMonth + "日");
        //getTime方法
        Date date = cal.getTime();
        System.out.println(date);
    }
}

