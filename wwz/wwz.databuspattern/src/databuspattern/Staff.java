package databuspattern;

import tools.PrintTool;

/**
 * @Author Wang Wenzheng
 * @Description: 海底世界的工作人员，能够处理寻人启事和通知消息
 * @Date: Created in 16:20 2020/11/28
 * @Modified By:
 **/
public class Staff extends Listener{
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
    public Staff(String name) {
        super(name);
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 工作人员接受数据总线消息的接口,工作人员类只需要处理寻人启事和通知消息
     * @Param Type
     * param: message
     * resume: 消息对象
     * @Return Value
     * @return: void
     * @resume:
     * @Date: 16:15 2020/11/28
     * @Modified By:
     */
    @Override
    public void acceptMessage(Message message) {
        if(message instanceof ChildLostMessage){
            PrintTool.print("I'm staff " +name+" and I get the child lost message: "+message.getMessage());
        }
        if(message instanceof AnnouncementMessage){
            PrintTool.print("I'm staff " +name+" and I get the Announcement message: "+message.getMessage());
        }
    }
}
