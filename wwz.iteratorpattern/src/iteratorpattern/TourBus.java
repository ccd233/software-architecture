package iteratorpattern;

import tools.PrintTool;

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
    private ArrayList<Tourist> passengers;

    public int getSize(){
        return passengers.size();
    }

    public void addPassenger(Tourist tourist){
        passengers.add(tourist);
        PrintTool.print("tourist "+tourist.getName()+" should be in the bus");
    }

    public Tourist getFishByIndex(int index){
        return passengers.get(index);
    }

    @Override
    public Iterator iterator() {
        return new TourGuide(this);
    }
}
