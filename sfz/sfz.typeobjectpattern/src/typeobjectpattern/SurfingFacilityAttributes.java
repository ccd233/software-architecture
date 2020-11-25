package typeobjectpattern;

/**
 * @Author Shen Fangzhi
 * @Description: This contains several basic attributes of one kind of surfing facility.
 * @Date: Created in 20:50 2020/11/25
 * @Modified By:
 **/
public class SurfingFacilityAttributes {

    public SurfingFacilityAttributes(String name, int price, int maxSpeed, int loadingCapacity, String instructions) {
        this.name = name;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.loadingCapacity = loadingCapacity;
        this.instructions = instructions;
    }

    //Attribute:name
    public String name;

    //Attribute:price($/per hour)
    public int price;

    //Attribute:max speed(km/h)
    public int maxSpeed;

    //Attribute:loading capacity
    public int loadingCapacity;

    //Attribute:instructions(notes customers need to read before trying)
    public String instructions;
}
