package factorypattern;
import tools.PrintTool;

/**
 * @Author Chi Chengdao
 * @Description: 重写螃蟹的工厂
 **/

public class Crab implements Animal{
    @Override
    /**
     * speak方法的实现
     * @param
     * @return void
     * @author Chi Chengdao
     * @date 2020/11/27 11:34 下午
     */

    public void speak(){
        PrintTool.print("I am Crab!");
    }
    @Override
    /**
     * show方法的实现
     * @param
     * @return void
     * @author Chi Chengdao
     * @date 2020/11/27 11:36 下午
     */

    public void show() {
        PrintTool.print("I have claws,so I can pinch!");
    }
}
