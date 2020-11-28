package databuspattern;

/**
 * @Author Wang Wenzheng
 * @Description: 失物招领消息，是消息类的子类
 * @Date: Created in 16:27 2020/11/28
 * @Modified By:
 **/
public class LostAndFoundMessage extends Message {
    private DataBus dataBus;
    /**
     * @Author: Wang Wenzheng
     * @Description: 构造函数
     * @Param Type
     * param: message
     * resume: 信息中需要传递的字符串（与信息类型无关）
     * @Return Value
     * @return:
     * @resume:
     * @Date: 15:54 2020/11/28
     * @Modified By:
     */
    protected LostAndFoundMessage(String message) {
        super(message);
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 设置与数据总线（广播）的连接
     * @Param Type
     * param: dataBus
     * resume: 数据总线实例对象
     * @Return Value
     * @return: void
     * @resume:
     * @Date: 15:59 2020/11/28
     * @Modified By:
     */
    @Override
    public void setDataBus(DataBus dataBus) {
        this.dataBus=dataBus;
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 获取所需通知的信息
     * @Param Type
     * param:
     * resume:
     * @Return Value
     * @return: java.lang.String
     * @resume: 信息的内容，及类型（失物招领）
     * @Date: 15:56 2020/11/28
     * @Modified By:
     **/
    @Override
    public String getMessage() {
        return "Lost and Found:"+message;
    }
}
