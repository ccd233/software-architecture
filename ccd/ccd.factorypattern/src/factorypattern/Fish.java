package factorypattern;
import tools.PrintTool;
/**
 * @Author Chi Chengdao
 * @Description: 实现鱼类的工厂
 **/

public class Fish implements Animal{
    @Override
    public void speak() {
        PrintTool.print("I am Fish!");
    }

    @Override
    public void show() {
        PrintTool.print("I have a tail, so I can swim!");
    }
}
