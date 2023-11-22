package day08.arrays;

import java.util.Arrays;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/22
 * @time: 21:48
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo01 {
    public static void main(String[] args) {
        int[] arr={2,31,21,4,6,5,90};
        //打印数组。输出地址值
        System.out.println(arr);//[I@50cbc42f

        //数组内容转化为字符串
        String s = Arrays.toString(arr);
        //打印字符串，输出内容
        System.out.println(s);//[2, 31, 21, 4, 6, 5, 90]
    }
}
