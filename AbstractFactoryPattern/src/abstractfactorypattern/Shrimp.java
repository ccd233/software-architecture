package abstractfactorypattern;
import tools.Tool;
/**
 * @Author Chi Chengdao
 * @Description: 完成动物工厂中对其中接口的实现，即Shrimp的相应实现
 **/

public class Shrimp implements Animal{
    @Override
    public void speak() {
        Tool.print("Shrimp is Speaking");
        System.out.println("I am abstractfactorypattern.Shrimp!");
    }
    public void show() {
        Tool.print("Shrimp is Showing");
        System.out.println("Sorry, I am tasty, so you can eat me!");
    }
}
