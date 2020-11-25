package commandpattern;

/**
 * @Author Wang Wenzheng
 * @Description: 命令接口，任何命令类都需要实现该接口
 * @Date: Created in 21:23 2020/11/5
 * @Modified By:
 **/
public interface iOrder {
    /**
     * @Author: Wang Wenzheng
     * @Description: 命令的执行方法，调用一个命令对象的该方法后即执行该命令
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 21:26 2020/11/17
     * @Modified By:
    **/
    void execute();
}
