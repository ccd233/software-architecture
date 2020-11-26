package nullobjectpattern;
import tools.PrintTool;

/**
 * @Author Chi Chengdao
 * @Description: 空对象模式创建工厂对象，通过循环判断是否为可创建的对象，来创建工厂的对象或者空对象
 **/

public class AnimalFactory {
    public static final String[] names = {"小鲤鱼泡泡", "水母小美美", "双面龟"};
    /**
     * 通过判断动物是否存在用工厂创建相应的对象
     * @param name
     * @return nullobjectpattern.AbstractAnimal
     * @author Chi Chengdao
     * @date 2020/11/26 1:39 下午
     */
    public static AbstractAnimal getAnimal(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealAnimal(name);
            }
        }
        return new NullAnimal();
    }
}
