package databuspattern;

/**
 * @Author Wang Wenzheng
 * @Description: 接受数据总线消息的监听者抽象类
 * @Date: Created in 16:13 2020/11/28
 * @Modified By:
 **/
public abstract class Listener {
    protected final String name;

    /**
     * @Author: Wang Wenzheng
     * @Description: 构造函数
     *
     * @Param Type
     * param: name
     * resume: 接收者对象的名称
     *
     * @Return Value
     * @return:
     * @resume:
     *
     * @Date: 16:24 2020/11/28
     * @Modified By:
    **/
    public Listener(String name) {
        this.name = name;
    }
    /**
     * @Author: Wang Wenzheng
     * @Description: 接收广播消息，并根据消息类型进行处理，由子类实现
     *
     * @Param Type
     * param: message
     * resume: 消息对象
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 16:15 2020/11/28
     * @Modified By:
    **/
    public abstract void acceptMessage(Message message);
}
