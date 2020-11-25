package modulepattern;


/**
 * @Author Nie Yixin
 * @Description: buy ticket in cash
 * @Date: Created in 21:50 2020/11/25
 * @Modified By:
 **/
public class PaperTicket extends GetTicket{
    @Override
    void buyTicket() {
        System.out.println("buy the ticket in cash.");
    }

    @Override
    void getTicket() {
        System.out.println("get ticket immediately.");
    }
}
