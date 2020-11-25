package abstractfactorypattern;
import tools.PrintTool;

/**
 * @Author Chi Chengdao
 * @Description: 完成动物工厂中对其中接口的实现，即Crab的相应实现
 **/

public class Crab implements Animal{
    @Override
    public void speak(){
        PrintTool.print("Crab is Speaking");
        System.out.println("I am Crab!");
    }
    @Override
    public void show() {
        PrintTool.print("Crab is Showing");
        System.out.println("I have claws,so I can pinch!");
    }
}
