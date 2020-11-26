package abstractfactorypattern;
import tools.PrintTool;
/**
 * @Author Chi Chengdao
 * @Description: 完成动物工厂中对其中接口的实现，即Shrimp的相应实现
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
