package commandpattern;

import tools.PrintTool;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Wang Wenzheng
 * @Description:
 * @Date: Created in 21:44 2020/11/5
 * @Modified By:
 **/
public class Cook {
    private List<iOrder> orders = new ArrayList<>();

    public void takeOrder(iOrder order) {
        orders.add(order);
        PrintTool.print("get the order");
    }

    public void doOrders() {
        for (iOrder order : orders) {
            order.execute();
        }
        PrintTool.print("all orders done");
        orders.clear();
    }
}
