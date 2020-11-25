package abstractfactorypattern;
import tools.PrintTool;
/**
 * @Author Chi Chengdao
 * @Description: 继承抽象工厂，对获得员工工厂的方法进行重写
 **/

public class StaffFactory extends AbstractFactory{
    @Override
    public Animal getAnimal(String animal) {
        return null;
    }
    @Override
    public Staff getStaff(String staff){
        PrintTool.print("Staff Factory is Creating");
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
