package abstractfactorypattern;

/**
 * @Author Chi Chengdao
 * @Description: 抽象工厂通过抽象类完成获得动物工厂和员工工厂
 **/

public abstract class AbstractFactory {
    public abstract Animal getAnimal(String animal);
    public abstract Staff getStaff(String staff);
}
