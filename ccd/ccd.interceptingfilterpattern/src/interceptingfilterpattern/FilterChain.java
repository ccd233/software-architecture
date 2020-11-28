package interceptingfilterpattern;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author Chi Chengdao
 * @Description: 用于创建FilterChain的类,包括添加filter、指定最终的target和执行
 * @Date: Created in 12:01 上午 2020/11/26
 * @Modified By:
 **/
public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();
    private Customer customer;
    //添加filter
    public void addFilter(Filter filter){
        filters.add(filter);
    }
    //执行filter的work
    public void execute(String request){
        for (Filter filter : filters) {
            filter.work(request);
        }
        customer.eat(request);
    }
    //添加customer
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
}