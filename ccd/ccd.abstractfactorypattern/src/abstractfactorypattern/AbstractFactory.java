package abstractfactorypattern;

/**
 * @Author Chi Chengdao
 * @Description: 抽象工厂定义所有工厂应该有的接口
 **/

public abstract class AbstractFactory {
    /**
     * 使用工厂创建动物
     * @param animal
     * @return abstractfactorypattern.Animal
     * @author Chi Chengdao
     * @date 2020/11/26 1:23 下午
     */
    public abstract Animal getAnimal(String animal);
    /**
     * 使用工厂创建员工
     * @param staff
     * @return abstractfactorypattern.Staff
     * @author Chi Chengdao
     * @date 2020/11/26 1:24 下午
     */

    public abstract Staff getStaff(String staff);
}
