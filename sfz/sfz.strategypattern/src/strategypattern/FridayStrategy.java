package strategypattern;

import tools.PrintTool;

/**
 * @Author Shen Fangzhi
 * @Description: This is the Monday's menu information of the restaurant.
 * @Date: Created in 1:08 2020/11/28
 * @Modified By:
 **/
public class FridayStrategy implements Strategy {

    String menuInfo;

    /**
     * @Author: Shen Fangzhi
     * @Description: 设置星期五的菜单
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 2:03 2020/11/28
     * @Modified By:
    **/
    @Override
    public void setMenuINfo() {
        menuInfo = "Friday's menu is as follows: fried chicken.... ";
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 获取星期五的菜单
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 2:03 2020/11/28
     * @Modified By:
    **/
    @Override
    public void printMenuINfo() {
        PrintTool.print(menuInfo);
    }
}
