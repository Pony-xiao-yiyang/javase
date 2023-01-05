package javadoc;


/**
 * javaDoc
 *      1.Javadoc命令用来生成自己的API文档
 *      2参数信息
 * @description:    描述类的情况
 * @author: 作者
 * @time: 2022/12/19 18:14
 * @version    版本号
 * @since      指明需要最早使用的jdk版本
 * @return     返回值情况
 */
public class Demo01 {
    String name;

    /**
     *
     * @param name  参数值
     * @return  返回值情况
     * @throws Exception    抛出异常情况
     */
    public String test(String name) throws Exception{
        return name;

    }

    /**
     *
     * @param name
     * @return
     * @throws Exception
     */
    public String test1(String name) throws Exception{
        return name;

    }
}
