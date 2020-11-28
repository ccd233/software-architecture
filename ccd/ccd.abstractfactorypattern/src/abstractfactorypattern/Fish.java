package abstractfactorypattern;
import tools.PrintTool;
/**
 * @Author Chi Chengdao
 * @Description: 完成动物工厂中对其中接口的实现，即Fish的相应实现
 **/


public class Fish implements Animal{
    @Override
    //实现speak接口
    public void speak() {
        PrintTool.print("I am Fish!");
    }
    @Override
    //实现show接口
    public void show() {
        PrintTool.print("I have a tail, so I can swim!");
    }
}
