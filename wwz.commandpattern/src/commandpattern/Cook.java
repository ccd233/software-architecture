package commandpattern;

import tools.PrintTool;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Wang Wenzheng
 * @Description: 厨师类，厨师有一个命令队列，所有命令对象都会存在该队列中，当调用doOrders方法后辉将队列中的命令依次执行
 * @Date: Created in 21:44 2020/11/5
 * @Modified By:
 **/
public class Cook {
    //命令队列
    private List<iOrder> orders = new ArrayList<>();

    /**
     * @Author: Wang Wenzheng
     * @Description: 厨师接受一个命令，并将其加入命令队列
     *
     * @Param Type
     * param: order
     * resume: 一个实现了命令接口的命令实现类对象
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 21:29 2020/11/17
     * @Modified By:
    **/
    public void takeOrder(iOrder order) {
        orders.add(order);
        PrintTool.print("get the order");
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 厨师将命令队列的所有命令依次执行，执行后即将命令删除
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 21:30 2020/11/17
     * @Modified By:
    **/
    public void doOrders() {
        PrintTool.print("SpongeBob starts dealing the orders");
        for (iOrder order : orders) {
            order.execute();
        }
        PrintTool.print("all orders done");
        orders.clear();
    }
}
