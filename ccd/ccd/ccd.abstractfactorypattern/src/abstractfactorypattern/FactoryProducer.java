package abstractfactorypattern;
import tools.PrintTool;

/**
 * @Author Chi Chengdao
 * @Description: 抽象工厂通过抽象类完成获得动物工厂和员工工厂
 **/


public abstract class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Animal")){
            return new AnimalFactory();
        } else if(choice.equalsIgnoreCase("Staff")){
            return new StaffFactory();
        }
        return null;
    }
}
