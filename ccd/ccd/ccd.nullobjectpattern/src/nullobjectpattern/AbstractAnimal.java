package nullobjectpattern;

/**
 * @Author Chi Chengdao
 * @Description: 空对象模式使用抽象函数创建所需方法
 **/

public abstract class AbstractAnimal {
    protected String name;
    /**
     * 判断是否为空对象
     * @param
     * @return boolean
     * @author Chi Chengdao
     * @date 2020/11/26 1:38 下午
     */
    public abstract boolean isNil();
    /**
     * 获取动物名字
     * @param
     * @return java.lang.String
     * @author Chi Chengdao
     * @date 2020/11/26 1:41 下午
     */
    public abstract String getName();
}
