package proxytry;

import tools.PrintTool;

/**
 * @Author Shen Fangzhi
 * @Description: This represents the real subject.It is able to deal with all kinds of tickets.
 * @Date: Created in 23:31 2020/11/5
 * @Modified By:
 **/
public class MainOffice extends AbstractTicketOffice {
    private int ticketType;
    private int ticketNumber;
    private boolean state = true;

    public MainOffice(int ticketNumber, int ticketType) {
        loadInfo();
        this.ticketNumber = ticketNumber;
        this.ticketType = ticketType;
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 获取ticketOffice
     * @Param Type
     * param:
     * resume:
     * @Return Value
     * @return: int
     * @resume:票的种类
     * @Date: 16:10 2020/11/19
     * @Modified By:
     **/
    @Override
    public int ticketType() {
        return ticketType;
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 获取购票的数量
     * @Param Type
     * param:
     * resume:
     * @Return Value
     * @return: int
     * @resume: 票的数量
     * @Date: 16:12 2020/11/19
     * @Modified By:
     **/
    @Override
    public int ticketNumber() {
        return ticketNumber;
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 获取该售票厅的状态
     * @Param Type
     * param:
     * resume:
     * @Return Value
     * @return: boolean
     * @resume: 返回是否工作的boolean类型
     * @Date: 16:13 2020/11/19
     * @Modified By:
     **/
    @Override
    public boolean whetherWorking() {
        return state;
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 代表加载数据的过程
     * @Param Type
     * param:
     * resume:
     * @Return Value
     * @return: void
     * @resume:
     * @Date: 16:15 2020/11/19
     * @Modified By:
     **/
    private void loadInfo() {
        PrintTool.print("Ticket info loading...");
        int times = 5;
        for (int i = 0; i < times; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("..");
        }
        PrintTool.print("This ticket's concrete info is ....balabala....." + '\n' +
                "Ticket info loading completed.");
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 打印关于购买票的信息
     * @Param Type
     * param:
     * resume:
     * @Return Value
     * @return: void
     * @resume:
     * @Date: 16:15 2020/11/19
     * @Modified By:
     **/
    @Override
    public void print() {
        if (whetherWorking()) {
            PrintTool.print("Ticket number is " + ticketNumber + '\n' +
                    "Ticket type is " + types[ticketType] + "\n");
        } else {
            PrintTool.print("This ticket office is offline now!Please wait or go to the main office." + "\n");
        }
    }
}
