#	Java基础语法

**1.注释、标识符、关键字**

​	**（1）注释：**

​						平时我们编写代码，在代码量比较少的情况的时候，我们可以能看懂我们自己写的，但是当项目结构一旦复杂起来，我们就需要注释了。

​						注释并不能执行，是给我们写代码的人看的

​						**书写注释是一个很好的习惯**

Java中的注释有三种：

						- 单行注释
						- 多行注释
						- 文档注释

```java
/**
 * @description:文档注释
 * @author:
 * @time: 2022/10/23 19:48
 */
public class Demo01 {
    /**
     * 多行注释
     */
    public static void main(String[] args) {
        //单行注释
        System.out.println("hello,world");
    }
}
```

​	**(2)标识符：**

​					Java所有的组成部分都需要名字、类名、变量名以及方法名都被称为标识符。

							- 所有的标识符都应该以字母（A-Z或者a-z），美元符（$）或者下划线（_）开始
							- 首字母之后可以是字母（A-Z或者a-z），美元符（$）或者下划线（_）或者数字的任何字符组合
							-  **不能使用关键字作为变量名或者方法名**
							- 标识符是**大小写敏感**的
							- 合法标识符举例：age、$salary、_value、__1_value
							- 非合法标识符举例:123abc、-salary、#abc

​						

​	**(3)关键字：**

​					Java关键字是电脑语言里事先定义的，有特别意义的标识符，有时又叫保留字，还有特别意义的变量。 Java的关键字对Java的编译器有特殊的意义，他们用来表示一种数据类型，或者表示程序的结构等，关键字不能用作变量名、方法名、类名、包名和参数。eg:public，static，class，throw，throws，finally，void，private.......

**2.数据类型**

​	**强数据类型语言：**要求变量的使用要严格符合规定，所有变量都以必须先定义后才能使用，eg :Java，C++

​	**弱数据类型：**要求变量的使用可以不符合规定，所有变量都以不一定先定义后才能使用，eg: VB 

​	**Java的数据类型分为两大类：**

​		**基本类型：**

​						**数值类型：**

​										**整数类型：**byte占1个字节范围：-128-127

​															short占2个字节范围：-32768-32767

​															Int 占4个字节范围：-2,147,483,648 -2,147,483,647

​															long占8个字节范围：-9,223,372,036,854,775,808 到 9,223,372,036,854,775,807

​										**浮点类型：**

​														float占4个字节

​														double占8个字节

​										**字符类型:**char占两个字节

​						**Boolean类型：占1位其值只有true和false两个**



​		**引用类型：**		类

​								接口

​								数值

```java
/**
 * @description:八大数据类型
 * @author:
 * @time: 2022/10/25 20:05
 */
public class DatetypeDemo01 {
    public static void main(String[] args) {
        //八大数据类型

        //整数
        Integer integer =   1;//包装类
        Byte byte1 =  1;
        int     num1    =   10;//最常用
        byte    num2   =   20;
        short   num3  =   30;
        long    num4    =   30L;//Long类型要在数字后面加L

        //小数，浮点数
        float num5  =   40.2f;
        double num6 =   1.1314d;

        //字符
        char name = 'A';

        //字符串,string不是关键字，类
        String name1    =   "adolf";

        //布尔值
        boolean flag = true;
        boolean flag1 = false;




    }
}
```



​		**字节：**

​				位（bit）：是计算机内部数据储存的最小单位，110011000是一个八位二进制数

​				字节(byte)：是计算机中数据处理的基本单位，习惯上用大写B来表示

​				1B= 8bit;

​				字符：是指计算机中使用的字母、数字、字和符号



​				1B	=	2b;

​				1KB	=	1024B;

​				1M	=1024KB;

​				1G	=1024M;

```java
/**
 * @description:进制转换  浮点数拓展 字符拓展  转义字符  对象不一致  布尔值拓展 
 * @author:
 * @time: 2022/10/25 20:28
 */
public class DatetypeDemo02 {
    public static void main(String[] args) {
        //整数拓展:     进制      二进制0b       十进制     八进制0        十六进制0x
        int i = 10;
        int i2 = 010;//八进制0
        int i3 = 0x10;//十六进制0x  0-9 A-F 16

        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);

        System.out.println("===========================");

        //浮点数拓展     有限的 离散 存在舍入误差 接近但不等于
        //float
        //double
        //BigDecimal    数学工具类(银行业务常用)
        float f = 0.1f;//0.1
        double d = 1.0/10;//0.1
        System.out.println(f == d);//false
        System.out.println(f);
        System.out.println(d);

        float d1    =   2312312313222f;
        float d2    =   d1+1;
        System.out.println(d1   ==  d2);

        System.out.println("==========================");
        //字符拓展 所有字符本质还是数字
        //编码 Unicode表： 97 = a 2字节 范围 0-65536 Excel表 2^16 = 65536
        char c1 = 'a';
        char c2 = '中';

        System.out.println(c1);
        System.out.println((int) c1);
        System.out.println(c2);
        System.out.println((int) c2);


        //U0000 UFFFF
        char c3 = '\u0061';
        System.out.println(c3);//a

        //转义字符
        //  \t      制表符
        //  \n      换行
        //.....
        System.out.println("Hello\tworld");//Hello	world
        System.out.println("Hello\nworld");

        System.out.println("========================");


        //对象不一致，前者新创建了一个对象（相当于在一个堆里新创建了两个栈，同堆不同栈），后者对象一致（同栈同堆）
        String sa = new String("hello,world");
        String sb = new String("hello,world");
        System.out.println(sa == sb);

        String sc = "hello world";
        String sd = "hello world";
        System.out.println(sc == sd);

        //布尔值拓展
        boolean flag    =   true;
        if (flag==true){
            System.out.println("hello.world");
        }
        //默认if语句中判断语句为真，Less is more，代码精简易读
        if (flag){
            System.out.println("helloworld");
        }

    }
}
```



**3.类型转换**

​	由于Java是强类型语言，所有要进行有些运算的时候的，需要用到类型转换

	> 低---------------------------------------------->高
	>
	> byte,short，char -> int -> long ->float ->double

运算中，不同类型的数据转换为同一类型，然后再进行运算

​	强制转换  数据类型高的转数据类型小的，需要强制转换

​	自动转换	数据类型低的转数据类型高的，自动转换

​		注意点：

​				1.不能对Boolean进行转换

​				2.不能把对象类型转换为不相干的类型

​				3.在把高容量转换为低容量的时候，强制转换

​				4.转换的时候可能存在内存溢出，或者精度问题

```java
/**
 * @description:类型转换
 * @author:
 * @time: 2022/10/26 20:23
 */
public class TypeChangeDemo01 {
    public static void main(String[] args) {
        int i = 128;
        byte b = (byte) i;
        double c = i;
        /**
         * 强制转换 (类型)变量名     高--低
         * 自动转换     低---高
         */
        System.out.println(i);//128
        System.out.println(b);//-128    i最大值为127，内存溢出
        System.out.println(c);//128.0

        /**
         * 注意点：
         *
         * 			1.不能对Boolean进行转换
         *
         * 			2.不能把对象类型转换为不相干的类型
         *
         * 			3.在把高容量转换为低容量的时候，强制转换
         *
         * 			4.转换的时候可能存在内存溢出，或者精度问题
         */
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
public class TypeChangeDemo02 {
    public static void main(String[] args) {
        //操作比较大的数的时候，注意溢出问题
        //JDK7的新特性，数字之间可以用下划线分割
        int money = 10_0000_0000;
        System.out.println(money);
        int years = 20;
        int total = money * years;//-1477836480,计算的时候溢出了
        System.out.println(total);
        long total2 = money * years;//默认是int类型，转换之前已存在问题
        System.out.println(total2);
        long total3 = money * ((long) years);//先把一个数转换为Long
        System.out.println(total3);
    }
}
```



**4.变量、常量**

​		**变量是什么：**

​				就是可以变化的量！

​				Java是一种强类型语言，每个变量都必须声明其类型

​				Java变量是程序中最基本的存储单元，其要素包括为变量名,变量类型和作用域

> ​								type varName [= value] [{,varName[=value]}];
>
> ​							//数据类型	变量名	=	值;	可以使用逗号隔开来声明多个同类型变量

​		**注意事项：**

​						每个变量都有类型，类型可以是基本类型，也可以是引用类型

​						变量名必须是合法的标识符

​						变量声明是一条完整的语句，因此每一个声明都必须以分号结束

​		**变量作用域：**

​				**类变量**

​				**实例变量**

​				**局部变量**

> ​				
>
> ```
> /**
>  * @description:变量作用域
>  * @author:
>  * @time: 2022/10/31 10:20
>  */
> public class VariableDemo02Scope {
>     static  int allClicks   = 0;//类对象
>     String  str="hello,world";//实例对象
> 
>     public static void main(String[] args) {
>         method();
>     }
> 
>     private static void method() {
>         int i= 0;//局部变量
> 
>     }
> }
> /**
>  * @description:变量作用域
>  * @author:
>  * @time: 2022/10/31 10:20
>  */
> public class VariableDemo02Scope {
>     static  int allClicks   = 0;//类对象
>     String  str="hello,world";//实例对象
> 
>     public static void main(String[] args) {
>         method();
>     }
> 
>     private static void method() {
>         int i= 0;//局部变量
> 
>     }
> }
> ```

​					**常量：**

​							常量，初始化后不能再改变值！不会变动的值

​							所谓常量可以理解为一种特殊的变量，它的值被设定后，在程序运行过程中不允许改变

> final 常量名 = 值
>
> final double PI = 3.14

​							常量名一般使用大写字符



​		**变量的命名规范：**

​				所有变量、方法、类名：见名知意

​				类成员变量：首字母小写和驼峰原则：monthSalary	除了第一个单词外，后面的单词首字母大写

​				局部变量：首字母小写和驼峰原则

​				常量：大写字母和下划线：MAX_VALUE

​				类名：首字母大写和驼峰原则： Man,GoodMan

​				方法名：首字母小写和驼峰原则：run(),runRun();



**5.运算符**

**6.包机制、JavaDoc**

