package abstractfactorypattern;
import tools.Tool;

/**
 * @Author Chi Chengdao
 * @Description: 完成动物工厂中对其中接口的实现，即Crab的相应实现
 **/

public class Crab implements Animal{
    @Override
    public void speak(){
        Tool.print("Crab is Speaking");
        System.out.println("I am Crab!");
    }
    public void show() {
        Tool.print("Crab is Showing");
        System.out.println("I have claws,so I can pinch!");
    }
}
