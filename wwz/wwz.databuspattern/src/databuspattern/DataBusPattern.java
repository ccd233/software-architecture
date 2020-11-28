package databuspattern;

/**
 * @Author Wang Wenzheng
 * @Description: 数据总线模式
 * @Date: Created in 16:04 2020/11/28
 * @Modified By:
 **/
public class DataBusPattern {

    /**
     * @Author: Wang Wenzheng
     * @Description: 数据总线模式的封装接口 供Main调用
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 16:40 2020/11/28
     * @Modified By:
    **/
    public static void dataBus(){
        //创建数据总线（广播）
        final DataBus dataBus=DataBus.getDataBus();
        //创建游客并建立连接
        Listener tom=new Customer("tom");
        Listener alice=new Customer("alice");
        Listener bob=new Staff("bob");
        dataBus.addCustomer(tom).addCustomer(alice).addCustomer(bob);
        //创建消息并发送
        //寻人启事
        Message childLost=new ChildLostMessage("child named little lin lost ,anyone has seen him?");
        dataBus.broadcast(childLost);
        //失物招领
        Message lostAndFound = new LostAndFoundMessage("who lost a wallet? please come to customer center");
        dataBus.broadcast(lostAndFound);
        //通知
        Message announce = new AnnouncementMessage("all staff come to customer center now");
        dataBus.broadcast(announce);
    }
}
