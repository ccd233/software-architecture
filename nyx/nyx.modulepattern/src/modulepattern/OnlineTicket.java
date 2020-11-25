package modulepattern;

/**
 * @Author Nie Yixin
 * @Description: buy ticket online
 * @Date: Created in 21:48 2020/11/25
 * @Modified By:
 **/
public class OnlineTicket extends GetTicket{
    @Override
    void buyTicket() {
        System.out.println("buy tickets online.");
    }

    @Override
    void getTicket() {
        System.out.println("Get the ticket by presenting the purchase certificate.");
    }
}
