package commandpattern;

import tools.PrintTool;

/**
 * @Author Wang Wenzheng
 * @Description:
 * @Date: Created in 21:35 2020/11/5
 * @Modified By:
 **/
public class Dish {
    private String name;

    public Dish(String name) {
        this.name = name;
    }

    public void cookDish() {
        PrintTool.print("cook " + this.name);
    }

    public void cancelDish() {
        PrintTool.print("cancel " + this.name);
    }
}
