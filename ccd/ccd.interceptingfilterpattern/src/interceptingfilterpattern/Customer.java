package interceptingfilterpattern;
import tools.PrintTool;

/**
 * @Author Chi Chengdao
 * @Description: 真正处理request的类，经过filterchain后执行
 * @Date: Created in 12:00 上午 2020/11/26
 * @Modified By:
 **/
public class Customer {
    /**
     * 真正处理request的类，通过customer的eat方法实现，在经过filterchain后执行
     * @param request
     * @return void
     * @author Chi Chengdao
     * @date 2020/11/27 11:46 下午
     */

    public void eat(String request) {
        PrintTool.print("\nCustomer: I can eat "+request+" now!");
    }
}