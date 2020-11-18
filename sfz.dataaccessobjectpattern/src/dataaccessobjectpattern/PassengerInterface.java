package dataaccessobjectpattern;

import java.util.List;

/**
 * @Author Shen Fangzhi
 * @Description: In this file I defined a interface which is used to do some basic operations on passsenger.
 * @Date: Created in 19:07 2020/11/18
 * @Modified By:
 **/
public interface PassengerInterface {

    public List<Passenger> getAllPassengers();

    public Passenger getPassenger(int passengerNo);

    public void updatePassenger(Passenger passenger);

    public void deletePassenger(Passenger passenger);

    public  void addPassenger(Passenger passenger);
}
