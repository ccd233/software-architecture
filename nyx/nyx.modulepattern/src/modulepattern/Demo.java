package modulepattern;

/**
 * @Author Nie Yixin
 * @Description: two ways of get into the park
 * @Date: Created in 21:52 2020/11/25
 * @Modified By:
 **/
public class Demo {
    public void modulePattern() {
        System.out.println("The visitor buy ticket online:");
        GetTicket visitor = new OnlineTicket();
        visitor.enterPark();
        System.out.println("The visitor buy ticket in cash:");
        visitor = new PaperTicket();
        visitor.enterPark();
    }
}
