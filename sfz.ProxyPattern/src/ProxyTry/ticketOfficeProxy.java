package ProxyTry;

/**
 * @Author Shen Fangzhi
 * @Description: This represents small agents through which customers can only purchase specific tickets.
 * @Date: Created in 23:32 2020/11/5
 * @Modified By:
 **/
public class ticketOfficeProxy extends ticketOffice {
    private int ticketNumber;
    private int ticketType;
    private boolean state;
    private mainOffice main;

    public ticketOfficeProxy(int ticketNumber, int ticketType, boolean state) {
        this.state = state;
        this.ticketNumber = ticketNumber;
        this.ticketType = ticketType;
    }

    public int ticketType() {
        return ticketType;
    }

    public int ticketNumber() {
        return ticketNumber;
    }

    public boolean whetherWorking() {
        return state;
    }

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
        main = new mainOffice(ticketNumber, ticketType);
    }
}

