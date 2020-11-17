package iteratorpattern;

import tools.PrintTool;

import java.util.ArrayList;

/**
 * @Author Wang Wenzheng
 * @Description: 旅游车类，用于提供使用迭代器的场景
 * @Date: Created in 21:31 2020/11/4
 * @Modified By:
 **/
public class TourBus implements iAggregate {
    public TourBus(){
        this.passengers=new ArrayList<>();
    }
    //乘客列表
    private ArrayList<Tourist> passengers;

    public int getSize(){
        return passengers.size();
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 向乘客列表添加一个乘客
     *
     * @Param Type
     * param: tourist
     * resume: 乘客对象
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 21:36 2020/11/17
     * @Modified By:
    **/
    public void addPassenger(Tourist tourist){
        passengers.add(tourist);
        PrintTool.print("tourist "+tourist.getName()+" should be in the bus");
    }

    public Tourist getFishByIndex(int index){
        return passengers.get(index);
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 返回一个乘客列表的迭代器
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: iteratorpattern.Iterator
     * @resume: 乘客列表的迭代器
     *
     * @Date: 21:36 2020/11/17
     * @Modified By:
    **/
    @Override
    public iIterator iterator() {
        return new TourGuide(this);
    }
}
