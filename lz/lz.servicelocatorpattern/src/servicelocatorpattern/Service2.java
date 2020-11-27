package servicelocatorpattern;

/**
 * @Author Lin Zhe
 * @Description:
 * @Date: Created in 9:27 2020/11/27
 * @Modified By:
 **/
public class Service2 implements Service {
    public void execute(){
        System.out.println("Executing ShoppingService");
    }

    @Override
    public String getName() {
        return "ShoppingService";
    }
}