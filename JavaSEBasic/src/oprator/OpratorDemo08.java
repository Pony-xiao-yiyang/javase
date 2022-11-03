package oprator;

/**
 * @description:    拓展赋值运算符
 * @author:
 * @time: 2022/11/3 22:56
 */
public class OpratorDemo08 {

    public static void main(String[] args) {
        /**
         *  x ?   y   :   z
         *  if  x    ==  true    ,否则结果为z
         *
         */
        int score = 10;
        String  type =    score<60?"不及格":"及格";//必须掌握
        //if语句可以替换
        System.out.println(type);

    }
}
