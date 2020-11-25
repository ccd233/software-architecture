package nullobjectpattern;
import tools.PrintTool;

/**
 * @Author Chi Chengdao
 * @Description: 空对象模式创建工厂对象，通过循环判断是否为可创建的对象，来创建工厂的对象或者空对象
 **/

public class AnimalFactory {
    public static final String[] names = {"小鲤鱼泡泡", "水母小美美", "双面龟"};
    public static AbstractAnimal getAnimal(String name){
        PrintTool.print("Create Animal");
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealAnimal(name);
            }
        }
        return new NullAnimal();
    }
}
