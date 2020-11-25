package commandpattern;

import tools.PrintTool;

/**
 * @Author Wang Wenzheng
 * @Description: 命令模式的封装类，提供一个接口供Main调用
 * @Date: Created in 21:50 2020/11/5
 * @Modified By:
 **/
public class CommandPattern {
    /**
     * @Author: Wang Wenzheng
     * @Description: 将命令模式的调用封装为一个静态方法
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 21:23 2020/11/17
     * @Modified By:
    **/
    public static void command() {
        PrintTool.print(
                "Scenario:The Krusty Krab has some dishes, " +
                        "and customers can order or cancel dishes." +
                        "If there are a few orders come," +
                        "the SpongeBob will sovle them one by one");
        //dishes
        Dish krabbyPatty = new Dish("krabbyPatty");
        Dish cocacola = new Dish("cocacola");
        Dish chips = new Dish("chips");

        //orders
        iOrder kpOrder = new CookOrder(krabbyPatty);
        iOrder ccclOrder = new CookOrder(cocacola);
        iOrder chipsOrder = new CookOrder(chips);
        iOrder cancelChipsOrder = new CancelOrder(chips);
        iOrder cancelCcclOrder = new CancelOrder(cocacola);
        iOrder cancelKpOrder = new CancelOrder(krabbyPatty);

        Cook spongeBob = new Cook();
        //take orders
        spongeBob.takeOrder(kpOrder);
        spongeBob.takeOrder(ccclOrder);
        spongeBob.takeOrder(cancelChipsOrder);
        //deal orders
        spongeBob.doOrders();

        spongeBob.takeOrder(chipsOrder);
        spongeBob.takeOrder(cancelKpOrder);
        spongeBob.takeOrder(cancelCcclOrder);
        spongeBob.doOrders();
    }
}
