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
        PrintTool.print("cook some krabby patties");
        this.oven.roastSomething(this,time);
    }

    @Override
    public void callback() {
        PrintTool.print("here are some freshly cooked krabby patties");
    }
}
