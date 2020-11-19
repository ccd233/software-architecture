package dataaccessobjectpattern;

import java.util.List;

/**
 * @Author Shen Fangzhi
 * @Description: In this file I defined a interface which is used to do some basic operations on passsenger.
 * @Date: Created in 19:07 2020/11/18
 * @Modified By:
 **/
public interface PassengerInterface {

    /**
     * @Author: Shen Fangzhi
     * @Description: 获取所有游客信息并返回列表形式
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: java.util.List<dataaccessobjectpattern.Passenger>
     * @resume:所有游客的列表信息
     *
     * @Date: 14:14 2020/11/19
     * @Modified By:
    **/
    public List<Passenger> getAllPassengers();

    /**
     * @Author: Shen Fangzhi
     * @Description: 获取指定passenger的实例
     *
     * @Param Type
     * param: passengerNo
     * resume:游客的number
     *
     * @Return Value
     * @return: dataaccessobjectpattern.Passenger
     * @resume: 表示某一个游客
     *
     * @Date: 14:07 2020/11/19
     * @Modified By:
    **/
    public Passenger getPassenger(int passengerNo);

    /**
     * @Author: Shen Fangzhi
     * @Description: 更新指定游客的信息
     *
     * @Param Type
     * param: passenger
     * resume: 表示某一个游客
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 14:09 2020/11/19
     * @Modified By:
    **/
    public void updatePassenger(Passenger passenger);

    /**
     * @Author: Shen Fangzhi
     * @Description: 从数据库中删除指定游客的信息
     *
     * @Param Type
     * param: passenger
     * resume: 表示某一个游客
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 14:09 2020/11/19
     * @Modified By:
    **/
    public void deletePassenger(Passenger passenger);

    /**
     * @Author: Shen Fangzhi
     * @Description: 添加一个游客的信息进入数据库
     *
     * @Param Type
     * param: passenger
     * resume: 表示某一个游客
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 14:10 2020/11/19
     * @Modified By:
    **/
    public  void addPassenger(Passenger passenger);
}
