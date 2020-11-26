package factorypattern;
import tools.PrintTool;

/**
 * @Author Chi Chengdao
 * @Description: 实现虾的工厂
 **/

public class Shrimp implements Animal{
    @Override
    public void speak() {
        PrintTool.print("I am Shrimp!");
    }
    @Override
    public void show() {
        PrintTool.print("Sorry, I am tasty, so you can eat me!");
    }
}
