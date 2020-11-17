package proxytry;

/**
 * @Author Shen Fangzhi
 * @Description: This represents small agents through which customers can only purchase specific tickets.
 * @Date: Created in 23:32 2020/11/5
 * @Modified By:
 **/
public class TicketOfficeProxy extends TicketOffice {
    private int ticketNumber;
    private int ticketType;
    private boolean state;
    private MainOffice main;

    public TicketOfficeProxy(int ticketNumber, int ticketType, boolean state) {
        this.state = state;
        this.ticketNumber = ticketNumber;
        this.ticketType = ticketType;
    }

    @Override
    public int ticketType() {
        return ticketType;
    }

    @Override
    public int ticketNumber() {
        return ticketNumber;
    }

    @Override
    public boolean whetherWorking() {
        return state;
    }

    @Override
    public void print() {
        if (whetherWorking()) {
            if (ticketType != 1) {
                System.out.println("Ticket number is " + ticketNumber);
                System.out.println("Ticket type is " + types[ticketType]);
            } else {
                System.out.println("To purchase full-price ticket,now system will connect to the main office.");
                realize();
                main.print();
            }
        } else {
            System.out.println("This ticket office is offline now!Please wait or go to the main office.");
        }
    }

    private void realize() {
        main = new MainOffice(ticketNumber, ticketType);
    }
}

