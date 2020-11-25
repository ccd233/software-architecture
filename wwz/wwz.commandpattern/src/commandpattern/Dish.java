package commandpattern;

import tools.PrintTool;

/**
 * @Author Wang Wenzheng
 * @Description: 食品类，有制作和取消制作两个方法
 * @Date: Created in 21:35 2020/11/5
 * @Modified By:
 **/
public class Dish {
    private String name;

    public Dish(String name) {
        this.name = name;
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 制作该食品
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 21:28 2020/11/17
     * @Modified By:
    **/
    public void cookDish() {
        PrintTool.print("cook " + this.name);
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 取消制作该食品
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 21:28 2020/11/17
     * @Modified By:
    **/
    public void cancelDish() {
        PrintTool.print("cancel " + this.name);
    }
}
