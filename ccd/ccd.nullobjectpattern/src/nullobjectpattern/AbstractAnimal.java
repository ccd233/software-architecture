package nullobjectpattern;

/**
 * @Author Chi Chengdao
 * @Description: 空对象模式使用抽象函数创建所需方法
 **/

public abstract class AbstractAnimal {
    protected String name;
    public abstract boolean isNil();
    public abstract String getName();
}
