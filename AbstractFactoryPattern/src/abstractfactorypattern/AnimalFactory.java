package abstractfactorypattern;
import tools.Tool;
/**
 * @Author Chi Chengdao
 * @Description: 继承抽象工厂，对获得动物工厂的方法进行重写
 **/


public class AnimalFactory extends AbstractFactory{

    public Staff getStaff(String staff) {
        return null;
    }

    public Animal getAnimal(String animal){
        Tool.print("Animal Factory is Creating");
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
