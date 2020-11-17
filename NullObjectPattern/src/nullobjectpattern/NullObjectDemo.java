package nullobjectpattern;
import tools.Tool;
/**
 * @Author Chi Chengdao
 * @Description: 空对象模式测试demo
 **/

public class NullObjectDemo {
    public static void work() {
        Tool.print("Null Object Pattern Test Demo");
        AbstractAnimal animal1 = AnimalFactory.getAnimal("小鲤鱼泡泡");
        AbstractAnimal animal2 = AnimalFactory.getAnimal("水母小美美");
        AbstractAnimal animal3 = AnimalFactory.getAnimal("双面龟");
        AbstractAnimal animal4 = AnimalFactory.getAnimal("海马酷酷");

        System.out.println("Animals:");
        System.out.println(animal1.getName()+"   "+animal1.isNil());
        System.out.println(animal2.getName()+"   "+animal2.isNil());
        System.out.println(animal3.getName()+"   "+animal3.isNil());
        System.out.println(animal4.getName()+"   "+animal4.isNil());
    }
    public static void main(String[] args) {
        work();
    }
}
