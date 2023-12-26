package day20;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author: Adolf.Linus
 * @date: 2023/12/26
 * @time: 20:00
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class FOSWrite {
    public static void main(String[] args) throws IOException {
//        // 使用文件名称创建流对象
//        FileOutputStream fos = new FileOutputStream("fos.txt");
//        // 写出数据
//        fos.write(97); // 写出第1个字节
//        fos.write(98); // 写出第2个字节
//        fos.write(99); // 写出第3个字节
//        // 关闭资源
//        fos.close();



//        // 使用文件名称创建流对象
//        FileOutputStream fos = new FileOutputStream("fos.txt");
//        // 字符串转换为字节数组
//        byte[] b = "黑马程序员".getBytes();
//        // 写出字节数组数据
//        fos.write(b);
//        // 关闭资源
//        fos.close();


//        // 使用文件名称创建流对象
//        FileOutputStream fos = new FileOutputStream("fos.txt");
//        // 字符串转换为字节数组
//        byte[] b = "abcde".getBytes();
//        // 写出从索引2开始，2个字节。索引2是c，两个字节，也就是cd。
//        fos.write(b,2,2);
//        // 关闭资源
//        fos.close();

//        // 使用文件名称创建流对象
//        FileOutputStream fos = new FileOutputStream("fos.txt",true);
//        // 字符串转换为字节数组
//        byte[] b = "abcde".getBytes();
//        // 写出从索引2开始，2个字节。索引2是c，两个字节，也就是cd。
//        fos.write(b);
//        // 关闭资源
//        fos.close();

        // 使用文件名称创建流对象
        FileOutputStream fos = new FileOutputStream("fos.txt");
        // 定义字节数组
        byte[] words = {97,98,99,100,101};
        // 遍历数组
        for (int i = 0; i < words.length; i++) {
            // 写出一个字节
            fos.write(words[i]);
            // 写出一个换行, 换行符号转成数组写出
            fos.write("\r\n".getBytes());
        }
        // 关闭资源
        fos.close();
    }
}
/***
 * 输出结果：
 * abc
 */

/**
 * 输出结果：
 * 黑马程序员
 */

/**
 *输出结果：
 * cd
 */

/**
 * 文件操作前：cd
 * 文件操作后：cdabcde
 */

/**
 * 输出结果：
 * a
 * b
 * c
 * d
 * e
 */

