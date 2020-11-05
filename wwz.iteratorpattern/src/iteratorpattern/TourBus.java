package iteratorpattern;

import java.util.ArrayList;

/**
 * @Author Wang Wenzheng
 * @Description:
 * @Date: Created in 21:31 2020/11/4
 * @Modified By:
 **/
public class TourBus implements Aggregate {
    public TourBus(){
        this.passengers=new ArrayList<>();
    }
    private ArrayList<Fish> passengers;

    public int getSize(){
        return passengers.size();
    }

    public void addPassenger(Fish fish){
        passengers.add(fish);
    }

    public Fish getFishByIndex(int index){
        return passengers.get(index);
    }

    @Override
    public Iterator iterator() {
        return new TourBusIterator(this);
    }
}
