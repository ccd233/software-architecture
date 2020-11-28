package interceptingfilterpattern;
import tools.PrintTool;

/**
 * @Author Chi Chengdao
 * @Description: 服务员过滤器，用于记录一个order中request经过服务员的log
 * @Date: Created in 12:00 上午 2020/11/26
 * @Modified By:
 **/
public class WaiterFilter implements Filter{
    @Override
    //服务员过滤器work接口实现，用于记录一个order中request经过服务员的log
    public void work(String request) {
        PrintTool.print("\nWaiter: The cook has finished cooking "+request+", So I will serve the dishes to the customer!");
    }
}