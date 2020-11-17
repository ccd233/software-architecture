package abstractfactorypattern;
import tools.Tool;
/**
 * @Author Chi Chengdao
 * @Description: 完成员工工厂中对其中接口的实现，即Guard的相应实现
 **/

public class Guard implements Staff{
    public void work() {
        Tool.print("Guard is Working");
        System.out.println("I am a guard, I can keep you safe!");
    }
}
