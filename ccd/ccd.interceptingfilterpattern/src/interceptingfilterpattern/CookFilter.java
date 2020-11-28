package interceptingfilterpattern;
import tools.PrintTool;

/**
 * @Author Chi Chengdao
 * @Description: 厨师过滤器，用于记录一个order中request经过厨师的log
 * @Date: Created in 11:59 下午 2020/11/25
 * @Modified By:
 **/
public class CookFilter implements Filter{
    @Override
    /**
     * 厨师过滤器work接口实现，用于记录一个order中request经过厨师的log
     * @param request
     * @return void
     * @author Chi Chengdao
     * @date 2020/11/27 11:45 下午
     */

    public void work(String request) {
        PrintTool.print("\nCook: I will cook "+request+"!");
    }
}