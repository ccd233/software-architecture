package proxytry;

/**
 * @Author Shen Fangzhi
 * @Description: This class defines the basic structure of the ticket office.(Sell tickets)
 * @Date: Created in 23:19 2020/11/5
 * @Modified By:
 **/
public abstract class AbstractTicketOffice {
    public String[] types = new String[]{"occupying element", "full-price-ticket", "sightseeing-car ticket", "food-ticket", "other tickets"};

    /**
     * @Author: Shen Fangzhi
     * @Description: 获取票种类的抽象类
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: int
     * @resume:票的种类
     *
     * @Date: 16:18 2020/11/19
     * @Modified By:
    **/
    public abstract int ticketType();

    /**
     * @Author: Shen Fangzhi
     * @Description: 获取票的数量的抽象类
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: int
     * @resume:票的数量
     *
     * @Date: 16:18 2020/11/19
     * @Modified By:
    **/
    public abstract int ticketNumber();

    /**
     * @Author: Shen Fangzhi
     * @Description: 获取该售票厅的种类
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: boolean
     * @resume: 售票厅的状态
     *
     * @Date: 16:18 2020/11/19
     * @Modified By:
    **/
    public abstract boolean whetherWorking();

    /**
     * @Author: Shen Fangzhi
     * @Description: 打印所有关于购票信息的抽象类
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 16:20 2020/11/19
     * @Modified By:
    **/
    public abstract void print();
}
