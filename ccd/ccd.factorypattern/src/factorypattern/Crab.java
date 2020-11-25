package factorypattern;
import tools.PrintTool;

/**
 * @Author Chi Chengdao
 * @Description: 重写螃蟹的工厂
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
