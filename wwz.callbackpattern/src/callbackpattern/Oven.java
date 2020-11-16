package callbackpattern;

import tools.PrintTool;

import java.util.concurrent.TimeUnit;

/**
 * @Author Wang Wenzheng
 * @Description:
 * @Date: Created in 0:34 2020/11/14
 * @Modified By:
 **/
public class Oven {
    public void roastSomething(iCallback callback,int time) {
        PrintTool.print("Oven is roasting the krabby patties," +
                "and "+time+" seconds later it will be done");
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        PrintTool.print("Ding~~~ it's done");
        callback.callback();
    }
}
