package abstractfactorypattern;
import tools.PrintTool;
/**
 * @Author Chi Chengdao
 * @Description: 继承抽象工厂，对获得动物工厂的方法进行重写
 **/


public class AnimalFactory extends AbstractFactory{

    @Override
    /**
     * 动物工厂不需要重写创建员工对象的方法
     * @param staff
     * @return abstractfactorypattern.Staff
     * @author Chi Chengdao
     * @date 2020/11/27 11:19 下午
     */

    public Staff getStaff(String staff) {
        return null;
    }

    @Override
    /**
     * 动物工厂重写创建动物对象的方法
     * @param animal
     * @return abstractfactorypattern.Animal
     * @author Chi Chengdao
     * @date 2020/11/27 11:19 下午
     */

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
