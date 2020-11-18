package dataaccessobjectpattern;

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

    public PassengerInterfaceImplement() {
        passengers = new ArrayList<Passenger>();
        Passenger passenger1 = new Passenger("sfz", 1853574);
        Passenger passenger2 = new Passenger("lzy", 1853562);
        passengers.add(passenger1);
        passengers.add(passenger2);
    }

    @Override
    public void deletePassenger(Passenger passenger) {
        passengers.remove(passenger.getPassengerNo());
        System.out.println("This passenger's info is deleted: Passenger No " + passenger.getPassengerNo());
    }

    @Override
    public List<Passenger> getAllPassengers() {
        return passengers;
    }

    @Override
    public Passenger getPassenger(int passengerNo) {
        for (Passenger passenger : passengers) {
            if (passenger.getPassengerNo() == passengerNo) {
                return passenger;
            }
        }
        return null;
    }

    @Override
    public void updatePassenger(Passenger passenger) {
        for (Passenger passengerOne : passengers) {
            if (passengerOne.getPassengerNo() == passenger.getPassengerNo()){
                passengerOne.setName(passenger.getName());
            }
        }
        System.out.println("The passenger's info is updated: Passenger No " + passenger.getPassengerNo());
    }

    @Override
    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
        System.out.println("The new passenger's info is added: Passenger No " + passenger.getPassengerNo());
    }
}
