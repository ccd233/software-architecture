package modulepattern;

/**
 * @Author Nie Yixin
 * @Description: You have to buy and get the ticket when you go in. There are two ways to buy and get tickets
 * @Date: Created in 21:43 2020/11/25
 * @Modified By:
 **/
public abstract class GetTicket {
    /***
     * @Author: Nie Yixin
     * @Description: 买票
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
    abstract void buyTicket();
    /***
     * @Author: Nie Yixin
     * @Description: 取票
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
    abstract void getTicket();
    /***
     * @Author: Nie Yixin
     * @Description: 进园是固定的流程——买票，取票
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
    public final void enterPark() {
        buyTicket();
        getTicket();
    }
}
