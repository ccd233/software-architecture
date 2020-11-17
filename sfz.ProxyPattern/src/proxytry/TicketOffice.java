package proxytry;

/**
 * @Author Shen Fangzhi
 * @Description: This class defines the basic structure of the ticket office.(Sell tickets)
 * @Date: Created in 23:19 2020/11/5
 * @Modified By:
 **/
public abstract class TicketOffice {
    public String[] types = new String[]{"occupying element", "full-price-ticket", "sightseeing-car ticket", "food-ticket", "other tickets"};

    public abstract int ticketType();

    public abstract int ticketNumber();

    public abstract boolean whetherWorking();

    public abstract void print();
}
