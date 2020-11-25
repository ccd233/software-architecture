package callbackpattern;

import tools.PrintTool;

import java.util.concurrent.TimeUnit;

/**
 * @Author Wang Wenzheng
 * @Description: 烤箱类，从厨师类接受程序控制权后进行一段操作，待操作完毕后调用回调方法将程序控制权还给厨师类
 * @Date: Created in 0:34 2020/11/14
 * @Modified By:
 **/
public class Oven {
    /**
     * @Author: Wang Wenzheng
     * @Description: 进行一段操作，完毕后调用回调方法将程序控制权交回，该处简化为等待一定时间
     *
     * @Param Type
     * param: callback
     * resume: 需要将程序控制权交回的callback接口的实现
    param: time
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 21:09 2020/11/17
     * @Modified By:
    **/
    public void roastSomething(iCallback callback,int time) {
        PrintTool.print("Oven is roasting the krabby patties," +
                "and "+time+" seconds later it will be done");
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        PrintTool.print("Ding~~~ it's done");
        // call the callback method
        callback.callback();
    }
}
