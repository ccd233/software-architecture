package nullobjectpattern;
import tools.PrintTool;
/**
 * @Author Chi Chengdao
 * @Description: 空对象进行重写
 **/

public class NullAnimal extends AbstractAnimal{

    @Override
    public String getName() {
        PrintTool.print("Null Object does not have a Name");
        return "This Animal does not exist!";
    }

    @Override
    public boolean isNil() {
        PrintTool.print("Check the Object");
        return true;
    }
}
