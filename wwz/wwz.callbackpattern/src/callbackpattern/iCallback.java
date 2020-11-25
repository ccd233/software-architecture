package callbackpattern;

/**
 * @Author Wang Wenzheng
 * @Description: 回调函数的接口
 * @Date: Created in 0:30 2020/11/14
 * @Modified By:
 **/
public interface iCallback {
    /**
     * @Author: Wang Wenzheng
     * @Description: 任何想实现回调模式的类需要实现该函数，即用于触发回调
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 21:07 2020/11/17
     * @Modified By:
    **/
    void callback();
}
