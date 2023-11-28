package day10.jiekouduotai.duotai;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/27
 * @time: 20:05
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
class KeyBoard implements USB{
    @Override
    public void open() {
        System.out.println("键盘开启，红灯闪一次");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭，红灯熄灭");
    }
    @Override
    public void type(){
        System.out.println("键盘打字");
    }
}
