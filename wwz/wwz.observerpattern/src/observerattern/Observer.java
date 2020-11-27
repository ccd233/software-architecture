package observerattern;

/**
 * @Author Wang Wenzheng
 * @Description: 观察者抽象类
 * @Date: Created in 1:27 2020/11/28
 * @Modified By:
 **/
public abstract class Observer {
    protected CrabsKing crabsKing;
    /**
     * @Author: Wang Wenzheng
     * @Description: 获取通知
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 1:38 2020/11/28
     * @Modified By:
    **/
    public abstract void getNotice();
}
