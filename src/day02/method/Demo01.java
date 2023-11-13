package day02.method;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/13
 * @time: 21:14
 * @function:
 * @since:
 * @version:
 * @description:方法
 * @email ponyxiaoyiyang@gmail.com
 */
public class Demo01 {
    public static void main(String[] args) {
        /**
         * 方法：
         *      就是将一个功能抽取出来，把代码单独定义在一个大括号，形成一个单独的功能
         *      当我们需要这个功能的时候，就可以去调用。这样即实现了代码的复用性，也解决了代码冗余的现象
         *
         *
         * 定义格式
         *      修饰符 返回值类型 方法名(参数列表){
         *          代码....
         *          return;
         *      }
         *
         * 定义格式解释:
         *      *修饰符:目前固定写法为public static。
         *      *返回值类型:目前固定写法void,其他返回值类型在后面的课程讲解。
         *      *方法名:为我们定义的方法起名，满足标识符的规范，用来调用方法
         *      *参数列表:目前无参数，带有参数的方法在后面的课程讲解
         *      return:方法结束，因为返回值类型是void，方法大括号内地return可以不写。
         *
         */
        methodName();
        /**
         * 方法的调用
         *      方法在定义完成后，方法不会自己运行，必须被调用才能被执行，我们可以在主方法
         *      main中来调用我们自己定义好的方法。在主方法中，直接写要调用的方法名字就可以
         *      调用了
         */
        //调用定义的方法method
        method();

        /**
         * 调用练习
         *      将三元运算符代码抽取到自定义的方法中，并调用
         */
        operator();

        /**
         * 注意事项
         *      方法必须定义在一类方法中
         *      方法不能定义在另一个方法的里面
         */

    }
    //定义方法，方法中定义三元运算符

    public static void operator() {
        int i = 0;
        i = 1 == 2 ? 100 : 200;
        System.out.println(i);
        int j = 0;
         j = (3 < 4 ? 500 : 600);
        System.out.println(j);
    }

    //定义方法，被main方法调用
    public static void method() {
        System.out.println("自己定义的方法，需要被main调用执行");

    }

    public static void methodName() {
        System.out.println("这是一个方法");
    }
}
