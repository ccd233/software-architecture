package nullobjectpattern;
import tools.Tool;
/**
 * @Author Chi Chengdao
 * @Description: 空对象进行重写
 **/

public class NullAnimal extends AbstractAnimal{

    @Override
    public String getName() {
        Tool.print("Null Object does not have a Name");
        return "This Animal does not exist!";
    }

    @Override
    public boolean isNil() {
        Tool.print("Check the Object");
        return true;
    }
}
