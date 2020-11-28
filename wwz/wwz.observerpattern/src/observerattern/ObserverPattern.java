package observerattern;

import tools.PrintTool;

/**
 * @Author Wang Wenzheng
 * @Description: 将观察者模式封装到接口中，供Main调用
 * @Date: Created in 1:47 2020/11/28
 * @Modified By:
 **/
public class ObserverPattern {
    /**
     * @Author: Wang Wenzheng
     * @Description: 将观察者模式封装到接口中，供Main调用
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 18:33 2020/11/28
     * @Modified By:
    **/
    public static void observerPattern(){
        CrabsKing crabsKing=new CrabsKing();
        PrintTool.print("SpongeBob,Squidward and MrCrab are watching how many customers are in the Crabs King!");

        SpongeBob spongeBob=new SpongeBob(crabsKing);
        Squidward squidward =new Squidward(crabsKing);
        MrCrab mrCrab=new MrCrab(crabsKing);
        PrintTool.print("two customers come in");
        crabsKing.setCustomer(2);
        PrintTool.print("three more customers come in");
        crabsKing.setCustomer(5);
    }
}
