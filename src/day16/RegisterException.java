package day16;

/**
 * @author: Adolf.Linus
 * @date: 2023/12/6
 * @time: 21:11
 * @function:
 * @since:
 * @version:
 * @description:
 * @email ponyxiaoyiyang@gmail.com
 */
public class RegisterException extends Exception{
    /**
     * 空参构造
     */
    public RegisterException() {
    }

    /**
     *
     * @param message 表示异常提示
     */
    public RegisterException(String message) {
        super(message);
    }
}
