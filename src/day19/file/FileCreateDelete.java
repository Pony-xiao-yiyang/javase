package day19.file;

import java.io.File;
import java.io.IOException;

/**
 * @author: Adolf.Linus
 * @date: 2023/12/25
 * @time: 20:31
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class FileCreateDelete {
    /**
     * - `public boolean createNewFile()` ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
     * - `public boolean delete()` ：删除由此File表示的文件或目录。
     * - `public boolean mkdir()` ：创建由此File表示的目录。
     * - `public boolean mkdirs()` ：创建由此File表示的目录，包括任何必需但不存在的父目录。
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // 文件的创建
        File f = new File("aaa.txt");
        System.out.println("是否存在:"+f.exists()); // false
        System.out.println("是否创建:"+f.createNewFile()); // true
        System.out.println("是否存在:"+f.exists()); // true

        // 目录的创建
        File f2= new File("newDir");
        System.out.println("是否存在:"+f2.exists());// false
        System.out.println("是否创建:"+f2.mkdir());	// true
        System.out.println("是否存在:"+f2.exists());// true

        // 创建多级目录
        File f3= new File("newDira\\newDirb");
        System.out.println(f3.mkdir());// false
        File f4= new File("newDira\\newDirb");
        System.out.println(f4.mkdirs());// true

        // 文件的删除
        System.out.println(f.delete());// true

        // 目录的删除
        System.out.println(f2.delete());// true
        System.out.println(f4.delete());// false
    }
}
