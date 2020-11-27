package strategypattern;

import tools.PrintTool;

/**
 * @Author Shen Fangzhi
 * @Description: This is the Monday's menu information of the restaurant.
 * @Date: Created in 1:08 2020/11/28
 * @Modified By:
 **/
public class ThursdayStrategy implements Strategy {

    String menuInfo;

    /**
     * @Author: Shen Fangzhi
     * @Description: 设置星期四的菜单
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 2:04 2020/11/28
     * @Modified By:
    **/
    @Override
    public void setMenuINfo() {
        menuInfo = "Thursday's menu is as follows: fish hamburger.... ";
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 打印星期四的菜单
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 2:04 2020/11/28
     * @Modified By:
    **/
    @Override
    public void printMenuINfo() {
        PrintTool.print(menuInfo);
    }
}
