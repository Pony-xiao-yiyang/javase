package day11.finalqunxianneibulei.neibulei;

/**
 * @author: Adolf.Linus
 * @date: 2023/11/28
 * @time: 20:09
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class Person {
    private boolean live =true;

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    class Heart{
        public void jump(){
            //直接访问外部类成员
            if (live){
                System.out.println("心脏在跳动");
            }
            else {
                System.out.println("心脏不跳了");
            }
        }
    }

}
