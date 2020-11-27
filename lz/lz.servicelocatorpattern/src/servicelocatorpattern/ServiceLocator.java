package servicelocatorpattern;

/**
 * @Author Lin Zhe
 * @Description:
 * @Date: Created in 9:26 2020/11/27
 * @Modified By:
 **/
public class ServiceLocator {
    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static Service getService(String jndiName){

        Service service = cache.getService(jndiName);

        if(service != null){
            return service;
        }

        InitialContext context = new InitialContext();
        Service service1 = (Service)context.lookup(jndiName);
        cache.addService(service1);
        return service1;
    }
}