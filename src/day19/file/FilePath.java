package day19.file;

import java.io.File;

/**
 * @author: Adolf.Linus
 * @date: 2023/12/25
 * @time: 20:25
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class FilePath {
    /**
     * * **绝对路径**：从盘符开始的路径，这是一个完整的路径。
     * * **相对路径**：相对于项目目录的路径，这是一个便捷的路径，开发中经常使用。
     * @param args
     */
    public static void main(String[] args) {
        // D盘下的bbb.java文件
        File f = new File("D:\\bbb.java");
        System.out.println(f.getAbsolutePath());

        // 项目下的bbb.java文件
        File f2 = new File("bbb.java");
        System.out.println(f2.getAbsolutePath());
    }
    /**
     * 输出结果：
     * D:\bbb.java
     * D:\idea_project_test4\bbb.java
     */
}
