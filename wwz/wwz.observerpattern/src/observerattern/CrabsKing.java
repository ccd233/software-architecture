package observerattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Wang Wenzheng
 * @Description: 蟹堡王餐厅，用于提供观察者和被观察者之间的联系,主要用于记录蟹堡王内顾客的数量
 * @Date: Created in 1:26 2020/11/28
 * @Modified By:
 **/
public class CrabsKing {
    private List<Observer> observers;
    private int customer;
    /**
     * @Author: Wang Wenzheng
     * @Description: 构造函数，初始化顾客数量为0，并初始化观察者队列
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return:
     * @resume:
     *
     * @Date: 1:32 2020/11/28
     * @Modified By:
    **/
    public CrabsKing(){
        customer=0;
        observers=new ArrayList<>();
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 获取顾客数量
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: int
     * @resume: 顾客数量
     *
     * @Date: 1:33 2020/11/28
     * @Modified By:
    **/
    public int getCustomer() {
        return customer;
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 修改顾客的数量,并通知观察者顾客数量被修改
     *
     * @Param Type
     * param: customer
     * resume: 顾客数量
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 1:33 2020/11/28
     * @Modified By:
    **/
    public void setCustomer(int customer) {
        this.customer = customer;
        noticeAllObserver();
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 向观察者队列中添加观察者
     *
     * @Param Type
     * param: observer
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 1:35 2020/11/28
     * @Modified By:
    **/
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void noticeAllObserver(){
        for(Observer observer:observers){
            observer.getNotice();
        }
    }
}
