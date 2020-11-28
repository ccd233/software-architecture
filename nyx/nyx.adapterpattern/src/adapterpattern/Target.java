package adapterpattern;

/**
 * @Author Nie Yixin
 * @Description:
 * @Date: Created in 14:00 2020/11/13
 * @Modified By:
 **/
public interface Target {
    /***
     * @Author: Nie Yixin
     * @Description: 排队接口
     *
     * @Param Type
     *
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public void queue();
    /***
     * @Author: Nie Yixin
     * @Description: 快速排队接口
     *
     * @Param Type
     *
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public void quickQueue();
}
