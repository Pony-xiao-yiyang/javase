package day02.shujuleixing;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/13
 * @time: 17:36
 * @function:
 * @since:
 * @version:
 * @description:数据类型之强制转换
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo03 {
    /*
    double类型内存有8个字节， int类型内存有4个字节，1.5是double类型，取值范围大于int,
    可以理解为double是8升的水壶，int是4升的水壶，不能吧大水壶中的水直接放进小水壶中去

        *强制类型转换：将取值范围打的类型转换成取值范围小的类型
         比较而言，自动转换是Java自动执行的，儿强制转换需要我们自己手动执行

            转换格式：
                    变量类型 变量名 = (数据类型)被转换数值
     */
    public static void main(String[] args) {
//        int i = 1.5;//错误
        //double的数据类型强制转换为int类型，直接去掉小数点
        int i = (int) 1.5;
        /*
        同样的道理，当一个short类型与1相加，我们知道会类型提升，但是还想给结果赋值给short类型变量，就需要强制转换
         */
        //short类型变量，内存中2个字节
        short s = 1;
        /*
        出现编译失败
            s和1做运算的时候，1是int类型，s会被提升为int类型
            s+1后的结果是int类型，将结果在赋值会short类型时发生错误
            short内存2个字节，int类型是4个字节
            必须将int类型强制转换成short字节才能完成赋值
         */
//      s=s+1;//编译失败
        s= (short) (s+1);//编译成功


        /*
        强烈注意：
                浮点数成整数，直接取消小数点，可能造成数据损失精度
                int是强制转成short砍掉两个字节，可能造成数据丢失
         */
        //定义i1为short范围内最大值
        short i1 = 32767;
        //运算后，强制转换，砍掉两个字节后出现不确定的结果
         i1 = (short) (i1 + 10);
    }
}
