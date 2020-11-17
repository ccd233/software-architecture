package proxytry;

/**
 * @Author Shen Fangzhi
 * @Description: This represents the customers who will spend there money in this carnival.
 * @Date: Created in 23:35 2020/11/5
 * @Modified By:
 **/
public class ProxyPattern {
    public static void proxy() {
        System.out.println("Proxy Pattern" + "\n" +
                "Scenario Introduction:This is used for the tourists who intend to buy tickets in this carnival." + "\n" +
                "Customers can buy specific kinds of entertainment tickets at ticketOfficeProxy." + "\n" +
                "Only if the customer wants to buy the full tickets will create a main ticketOffice case." + "\n" +
                "The full tickets can only bu purchased at the main ticketOffice." + "\n");

        TicketOffice t1 = new TicketOfficeProxy(21, 3, true);
        TicketOffice t2 = new TicketOfficeProxy(30, 4, false);
        TicketOffice t3 = new TicketOfficeProxy(30, 1, true);
        t1.print();
        t2.print();
        t3.print();
    }
}
