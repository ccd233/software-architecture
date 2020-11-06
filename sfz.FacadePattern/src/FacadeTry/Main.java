package FacadeTry;

/**
 * @Author Shen Fangzhi
 * @Description: Test facade design model.Call the interface.(Client)
 * @Date: Created in 16:03 2020/11/6
 * @Modified By:
 **/


//        One important principle:Least Knowledge Principle
//        Each unit should have only limited knowledge about other units:only units"closely"related to the current unit.

public class Main {
    public static void main(String[] args) {
        sceneDisplay testDisplay = new sceneDisplay("DVD", "speaker");
        testDisplay.start();
        testDisplay.play();
        testDisplay.end();
    }
}
