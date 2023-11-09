package day01.bianliangandshujuleixing.primitivetypes;

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
