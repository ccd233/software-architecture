package callbackpattern;

import tools.PrintTool;

import java.util.PropertyResourceBundle;

/**
 * @Author Wang Wenzheng
 * @Description:
 * @Date: Created in 0:33 2020/11/14
 * @Modified By:
 **/
public class Cook implements iCallback {
    private Oven oven;

    public Cook(Oven oven) {
        this.oven = oven;
    }

    public void cookKrabbyPatty(int time) {
        PrintTool.print("SpongeBob put the krabby patties into oven");
        this.oven.roastSomething(this,time);
    }

    @Override
    public void callback() {
        PrintTool.print("SpongeBob completes the krabby patties and let Squidward Tentacles give them to customers");
    }
}
