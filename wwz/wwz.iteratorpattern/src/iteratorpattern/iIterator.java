package iteratorpattern;

/**
 * @Author Wang Wenzheng
 * @Description: 迭代器接口，任何需要实现迭代器的类都需要实现该接口
 * @Date: Created in 21:22 2020/11/4
 * @Modified By:
 **/
public interface iIterator {
    /**
     * @Author: Wang Wenzheng
     * @Description: 判断该节点是否有后继节点
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: boolean
     * @resume: 如果有后继节点则返回true，否则返回false
     *
     * @Date: 21:31 2020/11/17
     * @Modified By:
    **/
    public abstract boolean hasNext();
    /**
     * @Author: Wang Wenzheng
     * @Description: 返回当前节点，并将指针指向下一节点，应该在任何情况下都保证先调用hasNext方法后再调用该方法
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: java.lang.Object
     * @resume: 返回当前节点
     *
     * @Date: 21:32 2020/11/17
     * @Modified By:
    **/
    public abstract Object next();
}
