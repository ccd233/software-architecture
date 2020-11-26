package interceptingfilterpattern;

/**
 * @Author Chi Chengdao
 * @Description: 将request放到相应的FilterManager内进行处理
 * @Date: Created in 12:01 上午 2020/11/26
 * @Modified By:
 **/
public class Order {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}