package strategypattern;

import tools.PrintTool;

/**
 * @Author Shen Fangzhi
 * @Description: This is the Monday's menu information of the restaurant.
 * @Date: Created in 1:08 2020/11/28
 * @Modified By:
 **/
public class SaturdayStrategy implements Strategy {

    String menuInfo;

    /**
     * @Author: Shen Fangzhi
     * @Description: 设置星期六的菜单
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 2:01 2020/11/28
     * @Modified By:
    **/
    @Override
    public void setMenuINfo() {
        menuInfo = "Saturday's menu is as follows: Duck Blood in Chili Sauce.... ";
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 打印星期六的菜单
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
