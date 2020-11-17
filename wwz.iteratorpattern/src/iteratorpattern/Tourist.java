package iteratorpattern;

/**
 * @Author Wang Wenzheng
 * @Description: 表示乘客的类，此处作为被遍历的对象
 * @Date: Created in 21:26 2020/11/4
 * @Modified By:
 **/
public class Tourist {
    private String name;

    public Tourist(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
