package iteratorpattern;

import tools.PrintTool;

/**
 * @Author Wang Wenzheng
 * @Description:
 * @Date: Created in 21:50 2020/11/4
 * @Modified By:
 **/
public class Main {
    public static void main(String[] args) {
        TourBus bus=new TourBus();
        Iterator it=bus.iterator();

        bus.addPassenger(new Fish("bob"));
        bus.addPassenger(new Fish("tom"));
        bus.addPassenger(new Fish("sfz"));

        while (it.hasNext()){
            Fish fish=(Fish) it.next();
            PrintTool.print(fish.getName());
        }
    }
}
