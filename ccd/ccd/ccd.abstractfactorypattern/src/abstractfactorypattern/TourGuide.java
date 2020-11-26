package abstractfactorypattern;
import tools.PrintTool;
/**
 * @Author Chi Chengdao
 * @Description: 完成员工工厂中对其中接口的实现，即TourGuide的相应实现
 **/

public class TourGuide implements Staff{
    @Override
    public void work() {
        PrintTool.print("I am a guide, I can show you around!");
    }
}
