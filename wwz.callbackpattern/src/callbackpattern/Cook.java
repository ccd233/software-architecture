package callbackpattern;

import tools.PrintTool;

import java.util.PropertyResourceBundle;

/**
 * @Author Wang Wenzheng
 * @Description: 厨师类，厨师有一个烤箱，并且实现了使用烤箱烤蟹黄堡然后等待蟹黄堡烤好后调用回调函数将程序控制权交回给厨师
 * @Date: Created in 0:33 2020/11/14
 * @Modified By:
 **/
public class Cook implements iCallback {
    private Oven oven;


    public Cook(Oven oven) {
        this.oven = oven;
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 将程序控制权交给烤箱类
     *
     * @Param Type
     * param: time
     * resume: 烤炉烘烤蟹黄堡需要的时间（秒）
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 21:02 2020/11/17
     * @Modified By:
    **/
    public void cookKrabbyPatty(int time) {
        PrintTool.print("SpongeBob put the krabby patties into oven");
        this.oven.roastSomething(this,time);
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 烤箱类动作执行完毕后，调用该回调函数，将程序控制权交回厨师类，此时厨师类可继续进行后续操作，但在该方法中简化为输出一条语句
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 21:02 2020/11/17
     * @Modified By:
    **/
    @Override
    public void callback() {
        PrintTool.print("SpongeBob completes the krabby patties and let Squidward Tentacles give them to customers");
    }
}
