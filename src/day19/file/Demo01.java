package day19.file;

import java.io.File;

/**
 * @author: Adolf.Linus
 * @date: 2023/12/25
 * @time: 20:23
 * @function:
 * @since:
 * @version:
 * @description: File类
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo01 {
    /**
     * * `public File(String pathname) ` ：通过将给定的**路径名字符串**转换为抽象路径名来创建新的 File实例。
     * * `public File(String parent, String child) ` ：从**父路径名字符串和子路径名字符串**创建新的 File实例。
     * * `public File(File parent, String child)` ：从**父抽象路径名和子路径名字符串**创建新的 File实例。
     */
    // 文件路径名
    String pathname = "D:\\aaa.txt";
    File file1 = new File(pathname);

    // 文件路径名
    String pathname2 = "D:\\aaa\\bbb.txt";
    File file2 = new File(pathname2);

    // 通过父路径和子路径字符串
    String parent = "d:\\aaa";
    String child = "bbb.txt";
    File file3 = new File(parent, child);

    // 通过父级File对象和子路径字符串
    File parentDir = new File("d:\\aaa");
//    String child = "bbb.txt";
    File file4 = new File(parentDir, child);
}
