package strategypattern;

import tools.PrintTool;

/**
 * @Author Shen Fangzhi
 * @Description:This is the Monday's menu information of the restaurant.
 * @Date: Created in 1:09 2020/11/28
 * @Modified By:
 **/
public class TuesdayStrategy implements Strategy{

    String menuInfo;

    /**
     * @Author: Shen Fangzhi
     * @Description: 设置星期二的菜单
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 2:05 2020/11/28
     * @Modified By:
    **/
    @Override
    public void setMenuINfo() {
        menuInfo = "Tuesday's menu is as follows: mapo tofu.... ";
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 打印星期二的菜单
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 2:05 2020/11/28
     * @Modified By:
    **/
    @Override
    public void printMenuINfo() {
        PrintTool.print(menuInfo);
    }
}
