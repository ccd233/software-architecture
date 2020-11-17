package abstractfactorypattern;
import tools.Tool;
/**
 * @Author Chi Chengdao
 * @Description: 完成动物工厂中对其中接口的实现，即Fish的相应实现
 **/


public class Fish implements Animal{
    @Override
    public void speak() {
        Tool.print("Fish is Speaking");
        System.out.println("I am Fish!");
    }
    public void show() {
        Tool.print("Fish is Showing");
        System.out.println("I have a tail, so I can swim!");
    }
}
