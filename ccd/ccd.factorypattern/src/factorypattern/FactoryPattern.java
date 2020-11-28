package factorypattern;
/**
 * @Author Chi Chengdao
 * @Description: 工厂模式测试demo
 **/

import tools.PrintTool;

public class FactoryPattern {
    //工厂模式测试demo
    public static void work() {
        PrintTool.print("Factory Pattern Test Demo");

        System.out.println("使用工厂创建鱼类，螃蟹和虾类对象，每个对象调用自身的方法进行展示");

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
