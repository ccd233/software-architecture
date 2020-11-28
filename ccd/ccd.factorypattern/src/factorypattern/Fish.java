package factorypattern;
import tools.PrintTool;
/**
 * @Author Chi Chengdao
 * @Description: 实现鱼类的工厂
 **/

public class Fish implements Animal{
    @Override
    /**
     * 实现鱼类的speak接口
     * @param
     * @return void
     * @author Chi Chengdao
     * @date 2020/11/27 11:36 下午
     */

    public void speak() {
        PrintTool.print("I am Fish!");
    }

    @Override
    /**
     * 实现鱼类的show接口
     * @param
     * @return void
     * @author Chi Chengdao
     * @date 2020/11/27 11:37 下午
     */

    public void show() {
        PrintTool.print("I have a tail, so I can swim!");
    }
}
