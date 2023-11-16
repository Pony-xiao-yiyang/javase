package day05.neicun;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/16
 * @time: 20:40
 * @function:
 * @since:
 * @version:
 * @description:数组获取最大数元素
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo07 {
    public static void main(String[] args) {
        int[]arr={5,15,2000,10000,100,4000};
        //定义变量，保存数组中0索引的元素
        int max = arr[0];
        //遍历数组，取出每个元素
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                //max记录最大值
                max = arr[i];
            }
        }
        System.out.println("数组最大值是：" + max);
    }
}
