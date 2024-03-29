package day16;

import java.io.FileNotFoundException;

/**
 * @author: Adolf.Linus
 * @date: 2023/12/6
 * @time: 21:05
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class ThrowsDemo {
    public static void main(String[] args) throws FileNotFoundException {
        read("a.txt");
    }

    // 如果定义功能时有问题发生需要报告给调用者。可以通过在方法上使用throws关键字进行声明
    public static void read(String path) throws FileNotFoundException {
        if (!path.equals("a.txt")) {//如果不是 a.txt这个文件
            // 我假设  如果不是 a.txt 认为 该文件不存在 是一个错误 也就是异常  throw
            throw new FileNotFoundException("文件不存在");
        }
    }
}
