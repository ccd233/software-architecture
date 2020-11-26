package abstractfactorypattern;
import tools.PrintTool;
/**
 * @Author Chi Chengdao
 * @Description: 完成动物工厂中对其中接口的实现，即Fish的相应实现
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
