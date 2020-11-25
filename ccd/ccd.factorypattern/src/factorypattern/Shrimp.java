package factorypattern;
import tools.PrintTool;

/**
 * @Author Chi Chengdao
 * @Description: 重写虾的工厂
 **/

public class Shrimp implements Animal{
    @Override
    public void speak() {
        PrintTool.print("Shrimp is Speaking");
        System.out.println("I am Shrimp!");
    }
    @Override
    public void show() {
        PrintTool.print("Shrimp is Showing");
        System.out.println("Sorry, I am tasty, so you can eat me!");
    }
}
