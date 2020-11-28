package interceptingfilterpattern;

/**
 * @Author Chi Chengdao
 * @Description: 拦截过滤器模式的Demo，用点菜过程中经过收银员收钱（filterchain），厨师做菜（filterchain），
 *               服务员上菜（filterchain），顾客吃菜（target）的过程模拟出一个
 *               request经过filterchain后到traget的过程，并且记录相应的log。
 * @Date: Created in 12:02 上午 2020/11/26
 * @Modified By:
 **/
public class InterceptingFilterPattern {
    //模式演示
    public static void work() {
        //首先创造一条记录点菜做菜上菜吃菜信息log的FilterManager
        FilterManager filterManager = new FilterManager(new Customer());
        filterManager.addFilter(new CashierFilter());
        filterManager.addFilter(new CookFilter());
        filterManager.addFilter(new WaiterFilter());
        //为新的order赋值刚刚创建的FilterManager，用于记录本order上菜信息的log
        Order order = new Order();
        order.setFilterManager(filterManager);
        order.sendRequest("海底世界嘉年华豪华家庭套餐");
    }
}