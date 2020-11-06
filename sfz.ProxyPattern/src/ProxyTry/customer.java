package ProxyTry;

/**
 * @Author Shen Fangzhi
 * @Description: This represents the customers who will spend there money in this carnival.
 * @Date: Created in 23:35 2020/11/5
 * @Modified By:
 **/
public class customer {
    public static void main(String[] args) {
        ticketOffice t1 = new ticketOfficeProxy(21, 3, true);
        ticketOffice t2 = new ticketOfficeProxy(30, 4, false);
        ticketOffice t3 = new ticketOfficeProxy(30, 1, true);
        t1.print();
        t2.print();
        t3.print();
    }
}
