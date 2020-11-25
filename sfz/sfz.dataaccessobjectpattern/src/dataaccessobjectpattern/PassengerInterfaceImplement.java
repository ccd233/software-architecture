package dataaccessobjectpattern;

import tools.PrintTool;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Shen Fangzhi
 * @Description: This class is a concrete implement of the Passenger interface.
 * @Date: Created in 19:23 2020/11/18
 * @Modified By:
 **/
public class PassengerInterfaceImplement implements PassengerInterface {

    List<Passenger> passengers;

    /**
     * @Author: Shen Fangzhi
     * @Description: 初始化游客序列，添加两个初始游客lzy、sfz
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: * @return: null
     * @resume:
     *
     * @Date: 14:12 2020/11/19
     * @Modified By:
    **/
    public PassengerInterfaceImplement() {
        passengers = new ArrayList<Passenger>();
        Passenger passenger1 = new Passenger("sfz", 1853574);
        Passenger passenger2 = new Passenger("lzy", 1853562);
        passengers.add(passenger1);
        passengers.add(passenger2);
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 删除游客的具体实现
     *
     * @Param Type
     * param: passenger
     * resume: 表示某个游客
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 14:13 2020/11/19
     * @Modified By:
    **/
    @Override
    public void deletePassenger(Passenger passenger) {
        passengers.remove(passenger.getPassengerNo());
        PrintTool.print("This passenger's info is deleted: Passenger No " + passenger.getPassengerNo());
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 获取所有有课程信息具体实现
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: java.util.List<dataaccessobjectpattern.Passenger>
     * @resume:
     *
     * @Date: 14:13 2020/11/19
     * @Modified By:
    **/
    @Override
    public List<Passenger> getAllPassengers() {
        return passengers;
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 获取指定游客具体实现
     *
     * @Param Type
     * param: passengerNo
     * resume: 表示游客的number
     *
     * @Return Value
     * @return: dataaccessobjectpattern.Passenger
     * @resume: 返回一个游客实例
     *
     * @Date: 14:15 2020/11/19
     * @Modified By:
    **/
    @Override
    public Passenger getPassenger(int passengerNo) {
        for (Passenger passenger : passengers) {
            if (passenger.getPassengerNo() == passengerNo) {
                return passenger;
            }
        }
        return null;
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 更新指定游客信息具体实现
     *
     * @Param Type
     * param: passenger
     * resume: 表示一个具体游客
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 14:17 2020/11/19
     * @Modified By:
    **/
    @Override
    public void updatePassenger(Passenger passenger) {
        for (Passenger passengerOne : passengers) {
            if (passengerOne.getPassengerNo() == passenger.getPassengerNo()){
                passengerOne.setName(passenger.getName());
            }
        }
        PrintTool.print("The passenger's info is updated: Passenger No " + passenger.getPassengerNo());
    }

    /**
     * @Author: Shen Fangzhi
     * @Description:添加一个游客具体实现
     *
     * @Param Type
     * param: passenger
     * resume: 表示一个游客实例
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 14:17 2020/11/19
     * @Modified By:
    **/
    @Override
    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
        PrintTool.print("The new passenger's info is added: Passenger No " + passenger.getPassengerNo());
    }
}
