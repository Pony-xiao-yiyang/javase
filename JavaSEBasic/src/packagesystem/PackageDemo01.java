//定义包package
package packagesystem;

/**
 * 包机制
 *      1.包语句的语法格式为：
 *              package pkg1[.pkg2[.pkg3....]];
 *              比如package packagesystem
 *      2.一般利用公司域名倒置作为包名
 *              com.tangmen.www
 *              com.pornhub.www
 *              com.Xvideos.www
 *      3.导入包，需要使用"import"语句导入完成此功能
 *              import java.util.Date;
 */

import java.util.Date;

//导入这个包下的所有的类
import constant_variable.*;

/**
 * @description:
 * @author:
 * @time: 2022/11/4 22:36
 */
public class PackageDemo01 {
    public static void main(String[] args) {
        int i = 128;
        byte b = (byte) i;
        double c = i;

        System.out.println("=======================");
        System.out.println((int) 23.7);
        System.out.println((int) -45.89f);



        System.out.println("=======================");
        char d = 'a';
        int v = d + 1;
        System.out.println(v);
        System.out.println((char) v);

    }
}
