package observerattern;

import tools.PrintTool;

/**
 * @Author Wang Wenzheng
 * @Description: 蟹老板类，继承Observer类
 * @Date: Created in 1:45 2020/11/28
 * @Modified By:
 **/
public class MrCrab extends Observer{
    /**
     * @Author: Wang Wenzheng
     * @Description: 建立观察者和蟹堡王之间的联系，用于接受蟹堡王的通知
     * @Param Type
     * param: crabsKing
     * resume: 一个蟹堡王对象
     * @Return Value
     * @return:
     * @resume:
     * @Date: 1:41 2020/11/28
     * @Modified By:
     **/
    public MrCrab(CrabsKing crabsKing) {
        this.crabsKing = crabsKing;
        this.crabsKing.addObserver(this);
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 获取通知
     * @Param Type
     * param:
     * resume:
     * @Return Value
     * @return: void
     * @resume:
     * @Date: 1:38 2020/11/28
     * @Modified By:
     **/
    @Override
    public void getNotice() {
        PrintTool.print("I'm Mr.Crab,I get the notice that here are "
                + String.valueOf(this.crabsKing.getCustomer())
                + " customers,money!");
    }
}
