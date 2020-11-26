package nullobjectpattern;
import tools.PrintTool;
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
        return name;
    }
    @Override
    public boolean isNil() {
        return false;
    }
}
