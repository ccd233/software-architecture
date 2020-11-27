package servicelocatorpattern;

/**
 * @Author Lin Zhe
 * @Description:
 * @Date: Created in 9:27 2020/11/27
 * @Modified By:
 **/
public class InitialContext {
    public Object lookup(String jndiName){
        if(jndiName.equalsIgnoreCase("SERVICE1")){
            System.out.println("Looking up and creating a new GuideService object");
            return new Service1();
        }else if (jndiName.equalsIgnoreCase("SERVICE2")){
            System.out.println("Looking up and creating a new ShoppingService object");
            return new Service2();
        }
        return null;
    }
}
