package commandpattern;

import tools.PrintTool;

/**
 * @Author Wang Wenzheng
 * @Description:
 * @Date: Created in 21:50 2020/11/5
 * @Modified By:
 **/
public class CommandPattern {
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
