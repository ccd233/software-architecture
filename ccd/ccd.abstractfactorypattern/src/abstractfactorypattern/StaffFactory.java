package abstractfactorypattern;
import tools.PrintTool;
/**
 * @Author Chi Chengdao
 * @Description: 继承抽象工厂，对获得员工工厂的方法进行重写
 **/

public class StaffFactory extends AbstractFactory{
    @Override
    //员工工厂不需要对动物工厂对象进行创建
    public Animal getAnimal(String animal) {
        return null;
    }

    @Override
    /**
     *扩展员工工厂接口
     * @param staff
     * @return abstractfactorypattern.Staff
     * @author Chi Chengdao
     * @date 2020/11/27 11:31 下午
     */

    public Staff getStaff(String staff){
        if(staff == null){
            return null;
        }
        if(staff.equalsIgnoreCase("TourGuide")){
            return new TourGuide();
        } else if(staff.equalsIgnoreCase("Guard")){
            return new Guard();
        }
        return null;
    }
}
