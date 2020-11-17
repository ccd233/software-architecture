package abstractfactorypattern;
import tools.Tool;
/**
 * @Author Chi Chengdao
 * @Description: 继承抽象工厂，对获得员工工厂的方法进行重写
 **/

public class StaffFactory extends AbstractFactory{
    public Animal getAnimal(String animal) {
        return null;
    }
    public Staff getStaff(String staff){
        Tool.print("Staff Factory is Creating");
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
