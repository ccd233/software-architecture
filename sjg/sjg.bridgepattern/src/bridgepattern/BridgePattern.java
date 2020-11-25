package bridgepattern;
/**
 * @Author Song Jungang
 * @Description:点单
 * @Date: Created in 18:55 2020/11/18
 * @Modified By:
 **/
public class BridgePattern {
    /**
     * @Author: Song Jungang
     * @Description: 构建并打印订单
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 14:04 2020/11/19
     * @Modified By:
     **/
    public static void ordering() {
        Drink drink1 = new Coke();
        Size size1 = new Big();
        Drink drink2 = new Grapejuice();
        Size size2 = new Middle();
        Drink drink3 = new Orangejuice();
        Size size3 = new Small();
        size1.setDrink(drink1);
        size1.ordering();
        size1.setDrink(drink2);
        size1.ordering();
        size2.setDrink(drink3);
        size2.ordering();
        size3.setDrink(drink2);
        size3.ordering();
    }
}
