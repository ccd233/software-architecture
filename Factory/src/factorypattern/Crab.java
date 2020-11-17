package factorypattern;
import tools.Tool;

/**
 * @Author Chi Chengdao
 * @Description: 重写螃蟹的工厂
 **/

public class Crab implements Animal{
    @Override
    public void speak(){
        Tool.print("Crab is Speaking");
        System.out.println("I am Crab!");
    }
    @Override
    public void show() {
        Tool.print("Crab is Showing");
        System.out.println("I have claws,so I can pinch!");
    }
}
