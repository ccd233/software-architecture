package databuspattern;

import tools.PrintTool;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Wang Wenzheng
 * @Description: 数据总线
 * @Date: Created in 15:01 2020/11/28
 * @Modified By:
 **/

public class DataBus {
    private static final DataBus DATA_BUS = new DataBus();

    private final List<Listener> customers = new ArrayList<>();

    /**
     * @Author: Wang Wenzheng
     * @Description: 使用单例模式创建数据总线,保证海底世界的广播系统只有一个
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: databuspattern.DataBus
     * @resume: 返回数据总线实例
     *
     * @Date: 15:07 2020/11/28
     * @Modified By:
    **/
    public static DataBus getDataBus() {
        return DATA_BUS;
    }

   /**
    * @Author: Wang Wenzheng
    * @Description: 向广播数据总线中添加一个游客, 采用流式接口模式
    *
    * @Param Type
    * param: customer
    * resume:游客对象，
    *
    * @Return Value
    * @return: void
    * @resume:
    *
    * @Date: 15:08 2020/11/28
    * @Modified By:
   **/
    public DataBus addCustomer(final Listener listener) {
        this.customers.add(listener);
        return this;
    }

   /**
    * @Author: Wang Wenzheng
    * @Description: 向外发布信息
    *
    * @Param Type
    * param: message
    * resume: 广播消息对象
    *
    * @Return Value
    * @return: void
    * @resume:
    *
    * @Date: 15:09 2020/11/28
    * @Modified By:
   **/
    public void broadcast(final Message message) {
        PrintTool.print("Broadcast:"+message.getMessage());
        message.setDataBus(this);
        customers.forEach(customer -> customer.acceptMessage(message));
    }
}
