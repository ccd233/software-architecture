package abstractfactorypattern;
import tools.Tool;
/**
 * @Author Chi Chengdao
 * @Description: 完成员工工厂中对其中接口的实现，即TourGuide的相应实现
 **/

public class TourGuide implements Staff{
    public void work() {
        Tool.print("TourGuide is Working");
        System.out.println("I am a guide, I can show you around!");
    }
}
