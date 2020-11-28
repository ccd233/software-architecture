package nullobjectpattern;
import tools.PrintTool;
/**
 * @Author Chi Chengdao
 * @Description: 空对象进行重写
 **/

public class NullAnimal extends AbstractAnimal{

    @Override
    /**
     * name的getter
     * @param  
     * @return java.lang.String
     * @author Chi Chengdao
     * @date 2020/11/28 12:08 上午
     */
    
    public String getName() {
        return "This Animal does not exist!";
    }
    @Override
    /**
     * 判断是否为空对象
     * @param  
     * @return boolean
     * @author Chi Chengdao
     * @date 2020/11/28 12:09 上午
     */
    
    public boolean isNil() {
        return true;
    }
}
