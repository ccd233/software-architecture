package databuspattern;

/**
 * @Author Wang Wenzheng
 * @Description: 广播传递出去的消息抽象类
 * @Date: Created in 14:59 2020/11/28
 * @Modified By:
 **/
public abstract class Message {
    protected final String message;
    protected DataBus dataBus;

    /**
     * @Author: Wang Wenzheng
     * @Description: 构造函数
     *
     * @Param Type
     * param: message
     * resume: 信息中需要传递的字符串（与信息类型无关）
     *
     * @Return Value
     * @return:
     * @resume:
     *
     * @Date: 15:54 2020/11/28
     * @Modified By:
    **/
    protected Message(String message) {
        this.message = message;
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 设置与数据总线（广播）的连接
     *
     * @Param Type
     * param: dataBus
     * resume: 数据总线实例对象
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 15:59 2020/11/28
     * @Modified By:
    **/
    public abstract void setDataBus(DataBus dataBus);

    /**
     * @Author: Wang Wenzheng
     * @Description: 获取所需通知的信息
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: java.lang.String
     * @resume: 信息的内容，需要包括信息的类型，所以由子类实现
     *
     * @Date: 15:56 2020/11/28
     * @Modified By:
    **/
    public abstract String getMessage();


}
