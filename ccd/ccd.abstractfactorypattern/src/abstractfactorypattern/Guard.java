package abstractfactorypattern;
import tools.PrintTool;
/**
 * @Author Chi Chengdao
 * @Description: 完成员工工厂中对其中接口的实现，即Guard的相应实现
 **/

public class Guard implements Staff{
    @Override
    //实现work接口
    public void work() {
        PrintTool.print("I am a guard, I can keep you safe!");
    }
}
