package factorypattern;
/**
 * @Author Chi Chengdao
 * @Description: 工厂模式测试demo
 **/

import tools.Tool;
import nullobjectpattern.NullObjectDemo;
import abstractfactorypattern.AbstractFactoryDemo;
import singletonpattern.SingletonDemo;

public class FactoryDemo {
    public static void work() {
        NullObjectDemo.work();
        AbstractFactoryDemo.work();
        SingletonDemo.work();
        Tool.print("Factory Pattern Test Demo");

        //生成动物工厂
        AnimalFactory animalFactory = new AnimalFactory();

        //获取 Fish 的对象，并调用它的 speak，show 方法
        Animal animal1 = animalFactory.getAnimal("Fish");

        //调用 Fish 的 speak，show 方法
        animal1.speak();
        animal1.show();

        //获取 Crab 的对象，并调用它的 speak，show 方法
        Animal animal2 = animalFactory.getAnimal("Crab");

        //调用 Crab 的 speak 方法
        animal2.speak();
        animal2.show();

        //获取 Shrimp 的对象，并调用它的 speak，show 方法
        Animal animal3 = animalFactory.getAnimal("Shrimp");

        //调用 Shrimp 的 speak，show 方法
        animal3.speak();
        animal3.show();
    }
    public static void main(String[] args) {
        work();
    }
}
