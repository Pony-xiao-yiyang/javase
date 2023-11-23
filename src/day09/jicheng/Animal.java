package day09.jicheng;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/23
 * @time: 19:00
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
 class Animal {
     public void eat(){
         System.out.println("animal:eat");
     }
}
class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("cat:eat");
    }
     public void eatTest(){
         this.eat();//this  调用本类方法
         super.eat();//super    调用父类方法

     }

}
