package abstractfactorypattern;
import tools.PrintTool;

/**
 * @Author Chi Chengdao
 * @Description: 完成动物工厂中对其中接口的实现，即Crab的相应实现
 **/

public class Crab implements Animal{
    @Override
    public void speak(){
        PrintTool.print("I am Crab!");
    }
    @Override
    public void show() {
        PrintTool.print("I have claws,so I can pinch!");
    }
}
