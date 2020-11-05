package commandpattern;

/**
 * @Author Wang Wenzheng
 * @Description:
 * @Date: Created in 21:50 2020/11/5
 * @Modified By:
 **/
public class Main {
    public static void main(String[] args) {
        //菜
        Dish krabbyPatty=new Dish("krabbyPatty");
        Dish cocacola=new Dish("cocacola");
        Dish chips =new Dish("chips");

        //订单
        iOrder kpOrder=new CookOrder(krabbyPatty);
        iOrder ccclOrder=new CookOrder(cocacola);
        iOrder cancelChipsOrder=new CancelOrder(chips);


        Cook spongeBob =new Cook();

        //处理
        spongeBob.takeOrder(kpOrder);
        spongeBob.takeOrder(ccclOrder);
        spongeBob.takeOrder(cancelChipsOrder);

        spongeBob.doOrders();

        spongeBob.takeOrder(cancelChipsOrder);
        spongeBob.takeOrder(kpOrder);
        spongeBob.takeOrder(ccclOrder);
        spongeBob.doOrders();
    }
}
