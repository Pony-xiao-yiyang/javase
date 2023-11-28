package day10.jiekouduotai.duotai;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/27
 * @time: 20:02
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
 class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("鼠标开启，红灯闪一次");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭，红灯熄灭");
    }

    @Override
    public void type() {

    }

    public void click(){
        System.out.println("鼠标单击");
    }
}
