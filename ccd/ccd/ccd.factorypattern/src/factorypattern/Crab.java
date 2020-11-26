package factorypattern;
import tools.PrintTool;

/**
 * @Author Chi Chengdao
 * @Description: 重写螃蟹的工厂
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
