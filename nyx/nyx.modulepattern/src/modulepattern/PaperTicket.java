package modulepattern;


import tools.PrintTool;

/**
 * @Author Nie Yixin
 * @Description: buy ticket in cash
 * @Date: Created in 21:50 2020/11/25
 * @Modified By:
 **/
public class PaperTicket extends GetTicket{
    /***
     * @Author: Nie Yixin
     * @Description: 现金购票
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
        PrintTool.print("buy the ticket in cash.");
    }
    /***
     * @Author: Nie Yixin
     * @Description: 现金购票的进园方式
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
        PrintTool.print("get ticket immediately.");
    }
}
