package abstractfactorypattern;
import tools.Tool;
/**
 * @Author Chi Chengdao
 * @Description: 抽象工厂测试demo
 **/


public class AbstractFactoryDemo {
    public static void work() {
        Tool.print("Abstract Factory Demo");

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
