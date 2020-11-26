package factorypattern;
import tools.PrintTool;
/**
 * @Author Chi Chengdao
 * @Description: 动物工厂生成器，通过不同的工厂方法生成不同的动物
 **/

public class AnimalFactory {
    public Animal getAnimal(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("Fish")){
            return new Fish();
        } else if(shapeType.equalsIgnoreCase("Crab")){
            return new Crab();
        } else if(shapeType.equalsIgnoreCase("Shrimp")){
            return new Shrimp();
        }
        return null;
    }
}
