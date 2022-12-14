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

​		**Java语言支持以下运算符：**

​			1.算术运算符：+，-，*，/，%，++，--

​			2.赋值运算符： =

​			3.关系运算符：>,<.>=,<=,==,!= instanceof

​			4.逻辑运算符：&&，||，！

​			5.位运算符:	&，|，^,~,>>,<<,>>>(了解！！！)

​			6.条件运算符？：

​			7.扩展赋值运算符:+=,-=,*=,/=

```java
/**
 * @description:运算符
 * @author:
 * @time: 2022/11/1 21:33
 */
public class OpratorDemo01 {
    public static void main(String[] args) {
            //二元运算符
        //cltl+d    复制整行
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a /(double) b);


    }
}


/**
 * @description:运算符
 * @author:
 * @time: 2022/11/1 22:01
 */
public class OpratorDemo02 {
    public static void main(String[] args) {
        long a = 12312312323L;
        int b = 123;
        short c = 10;
        byte d = 8;


        //没有long类型时，所有非int类型的都转为int类型
        System.out.println(a + b + c + d);//long
        System.out.println(b + c + d);//Int
        System.out.println(c + d);//Int
    }
}


/**
 * @description:运算符
 * @author:
 * @time: 2022/11/1 22:11
 */
public class OpratorDemo03 {
    public static void main(String[] args) {
        //关系运算符返回的结果：正确，错误      布尔值
        int a = 10;
        int b = 20;
        int c = 21;

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);
        //取余，模运算
        System.out.println(c % a); //c / a 21 / 10 = 2...1
    }
}


/**
 * @description:运算符——自增自减
 * @author:
 * @time: 2022/11/2 20:20
 */
public class OpratorDemo04 {
    public static void main(String[] args) {
        //++ -- 自增，自减 一元运算符
        int a = 3;


        int b = a++;//执行完这行代码后，先给b赋值，在自增
        //a=a+1;
        System.out.println(a);

        //a++   a=a+1;
        int c = ++a;//执行完这行代码前，先自增，再给b赋值

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //幂运算   2^3 2*2*2=8     我们会使用一些工具类来操作
        double pow = Math.pow(3, 2);
        System.out.println(pow);
    }
}

/**
 * @description:逻辑运算符
 * @author:
 * @time: 2022/11/2 20:33
 */
public class OpratorDemo05 {
    public static void main(String[] args) {
        //与(and)    或(or)   非(取反)
        boolean a = true;
        boolean b = false;

        System.out.println("a  &&  b:"+(a  &&  b));//逻辑与运算：两个变量都为真，结果才为true
        System.out.println("a  ||  b:" + (a || b));//逻辑或运算：两个变量有一为真，结果才为true
        System.out.println("!(a &&  b):" + !(a && b));//逻辑非运算：如果为真，则为假，如果是假则结果为真


        //短路运算
        int c = 5;
        boolean d = (c < 4) && (c++ < 4);
        System.out.println(d);
        System.out.println(c);


    }
}

/**
 * @description:位运算
 * @author:
 * @time: 2022/11/2 20:52
 */
public class OpratorDemo06 {
    public static void main(String[] args) {
        /**
         * A = 0011 1100
         * B = 0000 1101
         *
         * A&B  0000 1100   0假1真 11为真 其余都为假
         * A|B  0011 1101   0假1真 00为假，其余为真
         * A^B  0011 0001   相同为0 不同为1
         * ~B   1111 0010   取反
         *
         * 2*8 = 16 2*2*2*2
         *
         * <<   *2          左移几位    2<<3    就是0000 0010 变成  0001 0000 左移3位
         * >>   /2          右移几位    16>>3    就是0001 0000 变成  0000 0010 左移3位
         * 0000 0000 0
         * 0000 0001 1
         * 0000 0010 2
         * 0000 0011 3      2*2^1+1
         * 0000 0100 4      2*2^1
         *
         * 0000 1000 8      2*2^2
         * 0001 0000 16     2*2^3
         */
        System.out.println(2<<3);
    }
}
```



**6.包机制、JavaDoc**

​	**包机制**

​		**为了更好地组织类，Java提供了包机制，用于区别类名的命名空间**

​		**包语句的语法格式为：**

​			package pkg1[.	pkg2[.	pkg3]];

​		**一般利用公司域名倒置作为包名;**		eg：www.google.com	com.google.www

​		**为了能够使用某一个包的成员，我们需要在Java程序中明确导入该包。使用"import"语句可完成此功能**

> ​	import package1[.package2...].(classname|*);

​	

**7.  JavaDoc**

​		**javadoc命令是用来生成自己的API文档的**

​		**参数信息：**

​			***@author 作者名***

​			***@version    版本号***

​			***@since      指明需要最早使用的jdk版本***

​			***@return     返回值情况***

​			***@param   name	参数值***

​			***@throws Exception    抛出异常情况***



**8.  用户交互Scanner**

​			***scanner对象***

​				之前我们学的基本语法中我们并没有实现程序和人之间的交互，但是Java给我们提供了这样一个工具类，我们可以获取用户的输入。java.util.Scanner是Java5的新特征，我们可以通过Scanner类来获取用户的输入。

```java
Scanner s = new Scanner(System.in);
```

通过Scanner类的next()与nextLine（）方法获取输入的字符串，在读取前我们一般需要使用hashNext（）与hashNextLine（）判断是否还有输入的数据。

​					



​				***next()和nextline的区别***

​							next():

​									1.一定要读取到有效字符后才可以结束输入

​									2.对输入有效字符之前遇到的空白，next（）方法会自动将其去掉

​									3.只有输入有效字符后才将后面输入的空白作为分隔符或者结束符

​									4.next()不能得到带有空格的字符串

​							

​							nextLine():

​									1.以Enter为结束符，也就是说nextLine()方法返回的是输入回车之前的所有字符。

​									2.	可以获得空白

​	