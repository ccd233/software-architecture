package modulepattern;

import tools.PrintTool;

/**
 * @Author Nie Yixin
 * @Description: buy ticket online
 * @Date: Created in 21:48 2020/11/25
 * @Modified By:
 **/
public class OnlineTicket extends GetTicket{
    /***
     * @Author: Nie Yixin
     * @Description: 网上购票
     *
     * @Param Type
     *
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    @Override
    void buyTicket() {
        PrintTool.print("buy tickets online.");
    }
    /***
     * @Author: Nie Yixin
     * @Description: 网上购票的进园方式
     *
     * @Param Type
     *
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    @Override
    void getTicket() {
        PrintTool.print("Get the ticket by presenting the purchase certificate.");
    }
}
