package nullobjectpattern;
import tools.Tool;
import tools.Tool.*;
/**
 * @Author Chi Chengdao
 * @Description: 重新除空对象之外可以通过对象工厂创建的对象
 **/

public class RealAnimal extends AbstractAnimal{

    public RealAnimal(String name) {
        this.name=name;
    }
    @Override
    public String getName() {
        Tool.print("Get Animal's Name");
        return name;
    }

    @Override
    public boolean isNil() {
        Tool.print("Check the Object");
        return false;
    }
}
