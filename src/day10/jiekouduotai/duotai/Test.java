package day10.jiekouduotai.duotai;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/27
 * @time: 20:13
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class Test {
    public static void main(String[] args) {
        //创建笔记本实体对象
        Laptop lt = new Laptop();
        //笔记本开启
        lt.run();

        //创建鼠标实体对象
        USB u = new Mouse();
        //使用鼠标后
        lt.useUSB(u);

        //创建键盘实体对象
        KeyBoard kb = new KeyBoard();
        //笔记本使用键盘
        lt.useUSB(kb);

        //笔记本关闭
        lt.shutDown();
    }
}
