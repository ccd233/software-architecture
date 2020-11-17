package iteratorpattern;

/**
 * @Author Wang Wenzheng
 * @Description: 可以生成一个迭代器
 * @Date: Created in 21:32 2020/11/4
 * @Modified By:
 **/
public interface iAggregate {
    /**
     * @Author: Wang Wenzheng
     * @Description: 对一个实现了该聚合接口的类，需要实现一个返回该类迭代器的方法
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: iteratorpattern.Iterator
     * @resume: 返回一个实现了该集合类的迭代器
     *
     * @Date: 20:59 2020/11/17
     * @Modified By:
    **/
    public abstract iIterator iterator();
}
