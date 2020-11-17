package proxytry;

/**
 * @Author Shen Fangzhi
 * @Description: This represents the real subject.It is able to deal with all kinds of tickets.
 * @Date: Created in 23:31 2020/11/5
 * @Modified By:
 **/
public class MainOffice extends TicketOffice {
    private int ticketType;
    private int ticketNumber;
    private boolean state = true;

    public MainOffice(int ticketNumber, int ticketType) {
        loadInfo();
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

    private void loadInfo() {
        System.out.println("Ticket info loading...");
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("..");
        }
        System.out.println("This ticket's concrete info is ....balabala.....");
        System.out.println("Ticket info loading completed.");
    }

    @Override
    public void print() {
        if (whetherWorking()) {
            System.out.println("Ticket number is " + ticketNumber);
            System.out.println("Ticket type is " + types[ticketType]);
        } else {
            System.out.println("This ticket office is offline now!Please wait or go to the main office.");
        }
    }
}
