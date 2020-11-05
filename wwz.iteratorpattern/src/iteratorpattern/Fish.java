package iteratorpattern;

/**
 * @Author Wang Wenzheng
 * @Description: class as fish
 * @Date: Created in 21:26 2020/11/4
 * @Modified By:
 **/
public class Fish {
    private String name;

    /**
     * @Author: Wang Wenzheng
     * @Description: constructor with fish's name
     * @Param Type
     * param: name
     * resume: the fish's name
     * @Return Value
     * @return:
     * @resume:
     * @Date: 21:27 2020/11/4
     * @Modified By:
     **/
    public Fish(String name) {
        this.name = name;
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: return fish's name
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: java.lang.String
     * @resume:
     *
     * @Date: 21:28 2020/11/4
     * @Modified By:
    **/
    public String getName() {
        return this.name;
    }
}
