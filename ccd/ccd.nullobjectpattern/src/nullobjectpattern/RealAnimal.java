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
    /**
     * name的getter
     * @param
     * @return java.lang.String
     * @author Chi Chengdao
     * @date 2020/11/28 12:15 上午
     */

    public String getName() {
        return name;
    }
    @Override
    /**
     * 判断是否为空对象
     * @param
     * @return boolean
     * @author Chi Chengdao
     * @date 2020/11/28 12:16 上午
     */

    public boolean isNil() {
        return false;
    }
}
