package typeobjectpattern;

import tools.PrintTool;

/**
 * @Author Shen Fangzhi
 * @Description: This is used to test this pattern.
 * @Date: Created in 20:52 2020/11/25
 * @Modified By:
 **/
public class TypeObjectPattern {
    /**
     * @Author: Shen Fangzhi
     * @Description: 将类型对象模式封装为静态方法
     * @Param Type
     * param:
     * resume:
     * @Return Value
     * @return: void
     * @resume:
     * @Date: 20:53 2020/11/25
     * @Modified By:
     **/
    public static void typeObject() {
        PrintTool.print("Type Object Pattern" + "\n" +
                "Scenario Introduction:This is used for the customers who intend to choose the surfing facility." + "\n" +
                "Workers can create an attribute class and use it to create a facility class." + "\n" +
                "All the attributes of the facility is stored in the attributes class." + "\n");

        //use two attributes to create two surfing facilities.

        //attributes of marine motor
        SurfingFacilityAttributes motorAttributes = new SurfingFacilityAttributes(
                "motor",
                20,
                70,
                3,
                "Marine motor's speed is relatively fast.Pay special attention when the motor is turning."
        );

        //attributes of speedboat
        SurfingFacilityAttributes speedboatAttributes = new SurfingFacilityAttributes(
                "speedboat",
                50,
                100,
                6,
                "Speedboat's speed is quite fast.The water may come in when accelerating.Watch out your clothes."
        );
        SurfingFacility motor = new SurfingFacility(motorAttributes);
        motor.print();
        SurfingFacility speedboat = new SurfingFacility(speedboatAttributes);
        speedboat.print();
    }
}
