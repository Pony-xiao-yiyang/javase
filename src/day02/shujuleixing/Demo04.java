package day02.shujuleixing;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/13
 * @time: 18:38
 * @function:
 * @since:
 * @version:
 * @description:ASCII表
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo04 {
    public static void main(String[] args) {
        /*
                在计算机的内部都是二进制的0/1数据，如何让计算机可以直接识别人类文字的问题呢？就产生了编码表的概念

                        *   编码表:就是将人类的文字和一个十进制数进行对应起来组成一张表格
                                    字符                    数值
                                    0                       48
                                    9                       57
                                    A                       65
                                    Z                       90
                                    a                       97
                                    z                       122

                       *将所有的英文字母，数字，符号都和十进制进行了对应，产生了世界上第一套编码表ASCII(美国标准信息交换码)
         */
        //字符类型变量
        char c ='a';
        int i = 1;
        //字符类型和int类型计算
        System.out.println(c + i);//输出结果为98

    }
}
