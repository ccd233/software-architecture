package databuspattern;

import tools.PrintTool;

/**
 * @Author Wang Wenzheng
 * @Description: 游客类，能够接收寻人启事和失物招领消息
 * @Date: Created in 15:04 2020/11/28
 * @Modified By:
 **/
public class Customer extends Listener{

    /**
     * @Author: Wang Wenzheng
     * @Description: 构造函数
     * @Param Type
     * param: name
     * resume: 接收者对象的名称
     * @Return Value
     * @return:
     * @resume:
     * @Date: 16:24 2020/11/28
     * @Modified By:
     */
    public Customer(String name) {
        super(name);

    }
    /**
     * @Author: Wang Wenzheng
     * @Description: 游客接受数据总线消息的接口,游客类只需要处理寻人启事和失物招领消息
     *
     * @Param Type
     * param: message
     * resume: 消息对象
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 16:03 2020/11/28
     * @Modified By:
    **/
    @Override
    public void acceptMessage(Message message){
        if(message instanceof ChildLostMessage){
            PrintTool.print("I'm customer " +name+" and I get the child lost message: "+message.getMessage());
        }
        if (message instanceof LostAndFoundMessage){
            PrintTool.print("I'm customer " +name+" and I get the lost and found message: "+message.getMessage());
        }
    }
}
