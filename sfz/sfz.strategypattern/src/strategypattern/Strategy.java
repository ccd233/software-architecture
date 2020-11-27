package strategypattern;

/**
 * @Author Shen Fangzhi
 * @Description: This represents the stategy that the restaurant in this carnival  during the week.
 * @Date: Created in 1:03 2020/11/28
 * @Modified By:
 **/
public interface Strategy {

    /**
     * @Author: Shen Fangzhi
     * @Description: 设置菜单的抽象类
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 2:03 2020/11/28
     * @Modified By:
    **/
    public abstract void setMenuINfo();


    /**
     * @Author: Shen Fangzhi
     * @Description: 打印菜单的抽象类
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 2:03 2020/11/28
     * @Modified By:
    **/
    public abstract void printMenuINfo();
}
