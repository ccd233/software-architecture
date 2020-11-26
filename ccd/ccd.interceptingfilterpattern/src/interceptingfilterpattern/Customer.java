package interceptingfilterpattern;
import tools.PrintTool;

/**
 * @Author Chi Chengdao
 * @Description: 真正处理request的类，经过filterchain后执行
 * @Date: Created in 12:00 上午 2020/11/26
 * @Modified By:
 **/
public class Customer {
    public void eat(String request) {
        PrintTool.print("\nCustomer: I can eat "+request+" now!");
    }
}