package factorypattern;
import tools.PrintTool;

/**
 * @Author Chi Chengdao
 * @Description: 实现虾的工厂
 **/

public class Shrimp implements Animal{
    @Override
    /**
     * 虾类speak接口实现
     * @param
     * @return void
     * @author Chi Chengdao
     * @date 2020/11/27 11:38 下午
     */

    public void speak() {
        PrintTool.print("I am Shrimp!");
    }
    @Override

    /**
     * 虾类show接口实现
     * @param
     * @return void
     * @author Chi Chengdao
     * @date 2020/11/27 11:38 下午
     */
    public void show() {
        PrintTool.print("Sorry, I am tasty, so you can eat me!");
    }
}
