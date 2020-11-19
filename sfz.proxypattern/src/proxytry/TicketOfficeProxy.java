package proxytry;

/**
 * @Author Shen Fangzhi
 * @Description: This represents small agents through which customers can only purchase specific tickets.
 * @Date: Created in 23:32 2020/11/5
 * @Modified By:
 **/
public class TicketOfficeProxy extends AbstractTicketOffice {
    private int ticketNumber;
    private int ticketType;
    private boolean state;
    private MainOffice main;

    public TicketOfficeProxy(int ticketNumber, int ticketType, boolean state) {
        this.state = state;
        this.ticketNumber = ticketNumber;
        this.ticketType = ticketType;
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 代理售票处获取票的种类
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: int
     * @resume: 票的种类
     *
     * @Date: 16:20 2020/11/19
     * @Modified By:
    **/
    @Override
    public int ticketType() {
        return ticketType;
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 代理售票处获取票的数量
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: int
     * @resume: 票的数量
     *
     * @Date: 16:21 2020/11/19
     * @Modified By:
    **/
    @Override
    public int ticketNumber() {
        return ticketNumber;
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 代理售票处判断其是否工作
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: boolean
     * @resume: 代理售票厅的工作状态
     *
     * @Date: 16:21 2020/11/19
     * @Modified By:
    **/
    @Override
    public boolean whetherWorking() {
        return state;
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 打印代理售票厅的所有购票信息
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 16:23 2020/11/19
     * @Modified By:
    **/
    @Override
    public void print() {
        if (whetherWorking()) {
            if (ticketType != 1) {
                System.out.println("Ticket number is " + ticketNumber);
                System.out.println("Ticket type is " + types[ticketType] + "\n");
            } else {
                System.out.println("To purchase full-price ticket,now system will connect to the main office." );
                realize();
                main.print();
            }
        } else {
            System.out.println("This ticket office is offline now!Please wait or go to the main office." + "\n");
        }
    }

    private void realize() {
        main = new MainOffice(ticketNumber, ticketType);
    }
}

