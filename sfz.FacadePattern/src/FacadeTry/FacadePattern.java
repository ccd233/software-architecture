package FacadeTry;

/**
 * @Author Shen Fangzhi
 * @Description: Test facade design model.Call the interface.(Client)
 * @Date: Created in 16:03 2020/11/6
 * @Modified By:
 **/


//        One important principle:Least Knowledge Principle
//        Each unit should have only limited knowledge about other units:only units"closely"related to the current unit.

public class FacadePattern {
    public static void facade() {
        System.out.println("Facade Pattern" + "\n" +
                "Scenario Introduction:This is used for the display of videos." + "\n" +
                "Basically,this pattern can simplify the interface through which the user of the system want to operate the facilities." + "\n" +
                "In this case,the user can just create a case of sceneDisplay and start the whole process of play the video." + "\n" +
                "All the facilities will start working and stop after the video finished automatically." + "\n");

        sceneDisplay testDisplay = new sceneDisplay("DVD", "speaker");
        testDisplay.start();
        testDisplay.play();
        testDisplay.end();
    }
}
