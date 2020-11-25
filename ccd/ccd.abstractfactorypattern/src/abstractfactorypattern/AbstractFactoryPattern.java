package abstractfactorypattern;
import tools.PrintTool;
/**
 * @Author Chi Chengdao
 * @Description: 抽象工厂测试demo
 **/


public class AbstractFactoryPattern {
    public static void work() {
        PrintTool.print("Abstract Factory Demo");
        System.out.println("首先使用工厂生成器生成动物工厂，动物工厂创建鱼类，螃蟹和虾类对象，每个对象调用自己的方法进行展示");

        //抽象工厂获取animal的工厂类
        AbstractFactory animalFactory = FactoryProducer.getFactory("Animal");

        //获取 Fish 的对象，并调用它的 speak,show方法
        Animal animal1 = animalFactory.getAnimal("Fish");

        //调用 Fish 的 speak,show 方法
        animal1.speak();
        animal1.show();

        //获取 Crab 的对象，并调用它的 speak,show 方法
        Animal animal2 = animalFactory.getAnimal("Crab");

        //调用 Crab 的 speak,show 方法
        animal2.speak();
        animal2.show();

        //获取 Shrimp 的对象，并调用它的 speak,show 方法
        Animal animal3 = animalFactory.getAnimal("Shrimp");

        //调用 Shrimp 的 speak,show 方法
        animal3.speak();
        animal3.show();
        System.out.println("首先使用工厂生成器生成员工工厂，员工工厂创建导游，保安对象，每个对象调用自己的方法进行展示");

        //抽象工厂获取staff的工厂类
        AbstractFactory staffFactory = FactoryProducer.getFactory("Staff");

        //获取 TourGuide 的对象，并调用它的 work 方法
        Staff staff1=staffFactory.getStaff("TourGuide");
        staff1.work();

        //获取 Guard 的对象，并调用它的 work 方法
        Staff staff2=staffFactory.getStaff("Guard");
        staff2.work();
    }
    public static void main(String[] args) {
        work();
    }
}
