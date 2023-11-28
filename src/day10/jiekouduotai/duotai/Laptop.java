package day10.jiekouduotai.duotai;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/27
 * @time: 20:08
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class Laptop {
    //笔记本开启运行
    public void run(){
        System.out.println("笔记本运行");
    }

    public void useUSB(USB usb){
        //判断是否有USB设备
        if (usb != null) {
            usb.open();

            //类型转换，调用特有方法
            if (usb instanceof Mouse) {
                Mouse m = (Mouse) usb;
                m.click();
            }else if (usb instanceof KeyBoard){
                KeyBoard kb = (KeyBoard) usb;
                kb.type();
            }
            usb.close();
        }
    }
    public void shutDown(){
        System.out.println("笔记本关闭");
    }
}
