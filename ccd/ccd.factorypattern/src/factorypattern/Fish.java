package factorypattern;
import tools.PrintTool;
/**
 * @Author Chi Chengdao
 * @Description: 重写鱼类的工厂
 **/

public class Fish implements Animal{
    @Override
    public void speak() {
        PrintTool.print("Fish is Speaking");
        System.out.println("I am Fish!");
    }

    @Override
    public void show() {
        PrintTool.print("Fish is Showing");
        System.out.println("I have a tail, so I can swim!");
    }
}
