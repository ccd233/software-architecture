package compositepattern;
/**
 * @Author Song Jungang
 * @Description:Component
 * @Date: Created in 18:55 2020/11/18
 * @Modified By:
 **/
public abstract class Souvenir {
    /**
     * @Author: Song Jungang
     * @Description: 打印纪念品层级结构
     *
     * @Param Type
     * param: blank
     * resume:多个空格，用来分级
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 14:04 2020/11/19
     * @Modified By:
     **/
    public abstract void display(String blank);
    /**
     * @Author: Song Jungang
     * @Description: 添加纪念品
     *
     * @Param Type
     * param: souvenir
     * resume:纪念品名字
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 14:04 2020/11/19
     * @Modified By:
     **/
    public abstract void addSouvenir(Souvenir souvenir);
}
