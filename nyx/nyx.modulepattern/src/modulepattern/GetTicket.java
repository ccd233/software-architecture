package modulepattern;

/**
 * @Author Nie Yixin
 * @Description: You have to buy and get the ticket when you go in. There are two ways to buy and get tickets
 * @Date: Created in 21:43 2020/11/25
 * @Modified By:
 **/
public abstract class GetTicket {
    abstract void buyTicket();
    abstract void getTicket();

    public final void enterPark() {
        buyTicket();
        getTicket();
    }
}
