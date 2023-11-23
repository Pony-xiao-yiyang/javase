package day09.jicheng;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/23
 * @time: 18:34
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
class Fu {
    //FU 中的成员变量
    int num = 5;
    private int n;

    public Fu() {
        System.out.println("Fu()");
    }

    public void show(){
        System.out.println("Fu类中的show方法执行");
    }
}

class Zi extends Fu{
    public Zi() {
        //super():调用父类的构造方法
        super();
        System.out.println("Zi()");
    }

    //Zi中的成员变量
    int num2 = 6;
    //Zi中的成员变量
    public void show2(){
        //访问父类中的num
        System.out.println("Fu name=" + num);//继承而来，所以直接访问
        System.out.println("Fu name=" + super.num);
        System.out.println("Fu name=" + this.num);
        //访问子类中的num2
        System.out.println("Zi num2=" + num2);
        System.out.println("Zi类中的show2方法执行");


    }
}
class ExtendDemo02{
    public static void main(String[] args) {
        //创建子类
        Zi z = new Zi();
        //调用子类中的show方法
        z.show();
        z.show2();
    }
}

