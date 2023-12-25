package day19.file;

import java.io.File;

/**
 * @author: Adolf.Linus
 * @date: 2023/12/25
 * @time: 20:30
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class FileIs {
    public static void main(String[] args) {
        File f = new File("d:\\aaa\\bbb.java");
        File f2 = new File("d:\\aaa");
        // 判断是否存在
        System.out.println("d:\\aaa\\bbb.java 是否存在:"+f.exists());
        System.out.println("d:\\aaa 是否存在:"+f2.exists());
        // 判断是文件还是目录
        System.out.println("d:\\aaa 文件?:"+f2.isFile());
        System.out.println("d:\\aaa 目录?:"+f2.isDirectory());
    }
    /**
     * 输出结果：
     * d:\aaa\bbb.java 是否存在:true
     * d:\aaa 是否存在:true
     * d:\aaa 文件?:false
     * d:\aaa 目录?:true
     */
}
