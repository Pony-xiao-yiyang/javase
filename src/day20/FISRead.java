package day20;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author: Adolf.Linus
 * @date: 2023/12/26
 * @time: 20:05
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class FISRead {
    public static void main(String[] args) throws IOException {
//        // 使用文件名称创建流对象
//        FileInputStream fis = new FileInputStream("read.txt");
//        // 读取数据，返回一个字节
//        int read = fis.read();
//        System.out.println((char) read);
//        read = fis.read();
//        System.out.println((char) read);
//        read = fis.read();
//        System.out.println((char) read);
//        read = fis.read();
//        System.out.println((char) read);
//        read = fis.read();
//        System.out.println((char) read);
//        // 读取到末尾,返回-1
//        read = fis.read();
//        System.out.println( read);
//        // 关闭资源
//        fis.close();


//        // 使用文件名称创建流对象
//        FileInputStream fis = new FileInputStream("read.txt");
//        // 定义变量，保存数据
//        int b ;
//        // 循环读取
//        while ((b = fis.read())!=-1) {
//            System.out.println((char)b);
//        }
//        // 关闭资源
//        fis.close();

//        // 使用文件名称创建流对象.
//        FileInputStream fis = new FileInputStream("read.txt"); // 文件中为abcde
//        // 定义变量，作为有效个数
//        int len ;
//        // 定义字节数组，作为装字节数据的容器
//        byte[] b = new byte[2];
//        // 循环读取
//        while (( len= fis.read(b))!=-1) {
//            // 每次读取后,把数组变成字符串打印
//            System.out.println(new String(b));
//        }
//        // 关闭资源
//        fis.close();

        // 使用文件名称创建流对象.
        FileInputStream fis = new FileInputStream("read.txt"); // 文件中为abcde
        // 定义变量，作为有效个数
        int len;
        // 定义字节数组，作为装字节数据的容器
        byte[] b = new byte[2];
        // 循环读取
        while (( len= fis.read(b))!=-1) {
            // 每次读取后,把数组的有效字节部分，变成字符串打印
            System.out.println(new String(b,0,len));//  len 每次读取的有效字节个数
        }
        // 关闭资源
        fis.close();
    }
}
/**
 * 输出结果：
 * a
 * b
 * c
 * d
 * e
 * -1
 */

/**
 *输出结果：
 * a
 * b
 * c
 * d
 * e
 */

/**
 * 输出结果：
 * ab
 * cd
 * ed
 */


/**
 * 输出结果：
 * ab
 * cd
 * e
 */