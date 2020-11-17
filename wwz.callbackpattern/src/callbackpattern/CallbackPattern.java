package callbackpattern;

import tools.PrintTool;

/**
 * @Author Wang Wenzheng
 * @Description: 回调模式的封装类，提供一个接口供Main调用
 * @Date: Created in 0:41 2020/11/14
 * @Modified By:
 **/
public class CallbackPattern {
    /**
     * @Author: Wang Wenzheng
     * @Description: 将回调模式的调用封装为一个静态方法
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 21:01 2020/11/17
     * @Modified By:
    **/
    public static void callback() {
        PrintTool.print(
                "Scenario：SpongeBob want to make some krabby patties," +
                "he put them into oven.After some time, " +
                "the oven reminds SpongeBob that it's done and then SpongeBob does the follow-up operations");
        Oven krabbyPattyRoaster=new Oven();
        Cook spongeBob=new Cook(krabbyPattyRoaster);
        spongeBob.cookKrabbyPatty(3);
    }
}
