package typeobjectpattern;

import tools.PrintTool;

/**
 * @Author Shen Fangzhi
 * @Description: This represents a particular surfing facility that the tourists may take when surfing.
 * @Date: Created in 20:49 2020/11/25
 * @Modified By:
 **/
public class SurfingFacility {
    private SurfingFacilityAttributes attributes;

    public SurfingFacility(SurfingFacilityAttributes attributes) {
        this.attributes = new SurfingFacilityAttributes(
                attributes.name,
                attributes.price,
                attributes.maxSpeed,
                attributes.loadingCapacity,
                attributes.instructions
        );
        this.name = attributes.name;
        this.price = attributes.price;
        this.maxSpeed = attributes.maxSpeed;
        this.capacity = attributes.loadingCapacity;
        this.instructions = attributes.instructions;
    }

    public String name;

    public int price;

    public int maxSpeed;

    public int capacity;

    public String instructions;

    /**
     * @Author: Shen Fangzhi
     * @Description:该方法将所有该冲浪设备的属性都打印出来
     * @Param Type
     * param:
     * resume:
     * @Return Value
     * @return: void
     * @resume:
     * @Date: 21:13 2020/11/25
     * @Modified By:
     **/
    public void print() {
        PrintTool.print("This facility's attributes is as follows:" + "\n" +
                "name : " + this.name + "\n" +
                "price : " + this.price + "\n" +
                "max speed : " + this.maxSpeed + "\n" +
                "loading capacity : " + this.capacity + "\n" +
                "instructions : " + this.instructions + "\n");
    }
}
