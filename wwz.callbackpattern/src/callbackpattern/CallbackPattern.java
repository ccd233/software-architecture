package callbackpattern;

import tools.PrintTool;

/**
 * @Author Wang Wenzheng
 * @Description:
 * @Date: Created in 0:41 2020/11/14
 * @Modified By:
 **/
public class CallbackPattern {
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
