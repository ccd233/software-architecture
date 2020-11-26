package interceptingfilterpattern;

/**
 * @Author Chi Chengdao
 * @Description: FilterManager类，用于管理Filter
 * @Date: Created in 12:01 上午 2020/11/26
 * @Modified By:
 **/
public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Customer customer){
        filterChain = new FilterChain();
        filterChain.setCustomer(customer);
    }
    public void addFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.execute(request);
    }
}