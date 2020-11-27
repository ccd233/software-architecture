package servicelocatorpattern;

/**
 * @Author Lin Zhe
 * @Description:使用服务定位器模式实现了导游服务和购物服务的缓存
 * @Date: Created in 9:25 2020/11/27
 * @Modified By:
 **/
public class ServiceLocatorPattern {
    public static void work() {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}
