package abstractfactorypattern;
import tools.PrintTool;
/**
 * @Author Chi Chengdao
 * @Description: 继承抽象工厂，对获得动物工厂的方法进行重写
 **/


public class AnimalFactory extends AbstractFactory{

    @Override
    public Staff getStaff(String staff) {
        return null;
    }

    @Override
    public Animal getAnimal(String animal){
        if(animal == null){
            return null;
        }
        if(animal.equalsIgnoreCase("Fish")){
            return new Fish();
        } else if(animal.equalsIgnoreCase("Crab")){
            return new Crab();
        } else if(animal.equalsIgnoreCase("Shrimp")){
            return new Shrimp();
        }
        return null;
    }
}
