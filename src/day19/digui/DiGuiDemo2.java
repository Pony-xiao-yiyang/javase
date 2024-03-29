package day19.digui;

import java.io.File;

/**
 * @author: Adolf.Linus
 * @date: 2023/12/25
 * @time: 20:36
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class DiGuiDemo2 {
    public static void main(String[] args) {
        // 创建File对象
        File dir  = new File("D:\\aaa");
        // 调用打印目录方法
        printDir(dir);
    }

    public static void  printDir(File dir) {
        // 获取子文件和目录
        File[] files = dir.listFiles();
        // 循环打印
      	/*
      	  判断:
      	  当是文件时,打印绝对路径.
      	  当是目录时,继续调用打印目录的方法,形成递归调用.
      	*/
        for (File file : files) {
            // 判断
            if (file.isFile()) {
                // 是文件,输出文件绝对路径
                System.out.println("文件名:"+ file.getAbsolutePath());
            } else {
                // 是目录,输出目录绝对路径
                System.out.println("目录:"+file.getAbsolutePath());
                // 继续遍历,调用printDir,形成递归
                printDir(file);
            }
        }
    }
}
