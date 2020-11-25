package iteratorpattern;

import tools.PrintTool;

/**
 * @Author Wang Wenzheng
 * @Description: 迭代子模式的封装类，提供一个接口供Main调用
 * @Date: Created in 21:50 2020/11/4
 * @Modified By:
 **/
public class IteratorPattern {
    /**
     * @Author: Wang Wenzheng
     * @Description: 将迭代子模式的调用封装为一个静态方法
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 21:34 2020/11/17
     * @Modified By:
    **/
    public static void iterator() {
        PrintTool.print("Scenario:Here is a tour bus heading to Underwater World Carnival" +
                "with some tourists and a tour guide on it." +
                "Before they take off,tourists get in the bus one by one," +
                "and the tour guide calls the roll.");
        TourBus bus=new TourBus();
        iIterator it=bus.iterator();

        //adding passengers
        bus.addPassenger(new Tourist("bob"));
        bus.addPassenger(new Tourist("tom"));
        bus.addPassenger(new Tourist("dick"));
        bus.addPassenger(new Tourist("alice"));
        bus.addPassenger(new Tourist("lucy"));

        //iterate
        PrintTool.print("Scenario: the tour guide starts calling the roll");
        while (it.hasNext()){
            Tourist tourist =(Tourist) it.next();
            PrintTool.print("I see "+tourist.getName()+" is on the bus");
        }
        PrintTool.print("all tourists is in the bus ,let's start the trip!");
    }
    public static void main(String[] args) {
        iterator();
    }
}
