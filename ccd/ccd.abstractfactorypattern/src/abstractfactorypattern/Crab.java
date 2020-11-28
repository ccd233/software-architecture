package abstractfactorypattern;
import tools.PrintTool;

/**
 * @Author Chi Chengdao
 * @Description: 完成动物工厂中对其中接口的实现，即Crab的相应实现
 **/

public class Crab implements Animal{
    @Override
    /**
     * 实现speak接口
     * @param
     * @return void
     * @author Chi Chengdao
     * @date 2020/11/27 11:20 下午
     */

    public void speak(){
        PrintTool.print("I am Crab!");
    }
    @Override
    /**
     * 实现show接口
     * @param
     * @return void
     * @author Chi Chengdao
     * @date 2020/11/27 11:20 下午
     */

    public void show() {
        PrintTool.print("I have claws,so I can pinch!");
    }
}
