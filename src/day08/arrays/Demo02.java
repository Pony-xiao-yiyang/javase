package day08.arrays;

import java.util.Arrays;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/22
 * @time: 21:51
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo02 {
    public static void main(String[] args) {
        //定义int数组
        int[] arr={2,31,21,4,6,5,90};
        System.out.println("排序前："+ Arrays.toString(arr));//排序前：[2, 31, 21, 4, 6, 5, 90]

        //升序排序
        Arrays.sort(arr);
        System.out.println("排序后："+ Arrays.toString(arr));//排序后：[2, 4, 5, 6, 21, 31, 90]

        //降序排序
        for (int length = arr.length-1; length >= 0; length--) {
            System.out.println(arr[length]+" ");
        }
    }
}
