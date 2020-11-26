package interceptingfilterpattern;
import tools.PrintTool;

/**
 * @Author Chi Chengdao
 * @Description: 收银员过滤器，用于记录一个order中request经过收银员的log
 * @Date: Created in 11:59 下午 2020/11/25
 * @Modified By:
 **/
public class CashierFilter implements Filter{
    @Override
    public void work(String request) {
        PrintTool.print("\nCashier: I have the order--"+request+", So i will tell the cook to cook!");
    }
}