package ProxyTry;

/**
 * @Author Shen Fangzhi
 * @Description: This represents the real subject.It is able to deal with all kinds of tickets.
 * @Date: Created in 23:31 2020/11/5
 * @Modified By:
 **/
public class mainOffice extends ticketOffice {
    private int ticketType;
    private int ticketNumber;
    private boolean state = true;

    public mainOffice(int ticketNumber, int ticketType) {
        loadInfo();
        this.ticketNumber = ticketNumber;
        this.ticketType = ticketType;
    }

    public int ticketType() {
        /**
         * @Author: Shen Fangzhi
         * @Description:
         *      1.The ticket that can do all things.
         *      2.The sightseeing-car ticket.
         *      3.The food ticket.
         *      4.Other tickets.
         *
         * @Param Type
         * param:
         * resume:
         *
         * @Return Value
         * @return: int
         * @resume:
         *
         * @Date: 14:47 2020/11/6
         * @Modified By:
         **/
        return ticketType;
    }


    public int ticketNumber() {
        return ticketNumber;
    }

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

    public void print() {
        if (whetherWorking()) {
            System.out.println("Ticket number is " + ticketNumber);
            System.out.println("Ticket type is " + types[ticketType]);
        } else {
            System.out.println("This ticket office is offline now!Please wait or go to the main office.");
        }
    }
}
