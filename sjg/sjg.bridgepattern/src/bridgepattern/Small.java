package bridgepattern;
import tools.PrintTool;
/**
 * @Author Song Jungang
 * @Description:扩展抽象化角色Small
 * @Date: Created in 18:55 2020/11/18
 * @Modified By:
 **/
public class Small extends Size{
    @Override
    /**
     * @Author: Song Jungang
     * @Description: 抽象功能扩展
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 14:04 2020/11/19
     * @Modified By:
     **/
    public void ordering() {
        PrintTool.print(drink.getdrink() + " " + "small");
    }
}
