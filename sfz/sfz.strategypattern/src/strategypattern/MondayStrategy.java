package strategypattern;

import tools.PrintTool;

/**
 * @Author Shen Fangzhi
 * @Description: This is the Monday's menu information of the restaurant.
 * @Date: Created in 1:08 2020/11/28
 * @Modified By:
 **/
public class MondayStrategy implements Strategy {

    String menuInfo;

    /**
     * @Author: Shen Fangzhi
     * @Description: 设置星期一的菜单
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 2:02 2020/11/28
     * @Modified By:
    **/
    @Override
    public void setMenuINfo() {
        menuInfo = "Monday's menu is as follows: gongbao chicken.... ";
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 打印星期一的菜单
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 2:02 2020/11/28
     * @Modified By:
    **/
    @Override
    public void printMenuINfo() {
        PrintTool.print(menuInfo);
    }
}
