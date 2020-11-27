package servicelocatorpattern;

/**
 * @Author Lin Zhe
 * @Description:
 * @Date: Created in 9:27 2020/11/27
 * @Modified By:
 **/
public class Service1 implements Service {
    public void execute(){
        System.out.println("Executing GuideService");
    }

    @Override
    public String getName() {
        return "GuideService";
    }
}