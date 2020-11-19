package dataaccessobjectpattern;

/**
 * @Author Shen Fangzhi
 * @Description: This class represents a passenger.It contains a passenger's basic info,including name and passengerNumber
 * @Date: Created in 18:55 2020/11/18
 * @Modified By:
 **/

public class Passenger {

    private String name;
    private int passengerNo;

    Passenger(String name, int passengerNo) {
        this.name = name;
        this.passengerNo = passengerNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengerNo() {
        return passengerNo;
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 设置该passenger的numebr
     *
     * @Param Type
     * param: passengerNo
     * resume:passenger的numebr
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 14:04 2020/11/19
     * @Modified By:
    **/
    public void setPassengerNo(int passengerNo) {
        this.passengerNo = passengerNo;
    }
}
