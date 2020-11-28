package builderpattern;

/**
 * @Author Nie Yixin
 * @Description: Builder接口
 * @Date: Created in 13:01 2020/11/13
 * @Modified By:
 **/
public interface Builder {
    /***
     * @Author: Nie Yixin
     * @Description: 确定主餐接口
     *
     * @Param Type
     * MainCourse object
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    void setMainCourse(MainCourse mainCourse);
    /***
     * @Author: Nie Yixin
     * @Description: 创建饮料接口
     *
     * @Param Type
     * Drink object
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    void setDrinks(Drink drinks);
    /***
     * @Author: Nie Yixin
     * @Description: 确定价格接口
     *
     * @Param Type
     * int
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    void setPrice(int price);
    /***
     * @Author: Nie Yixin
     * @Description: 创建餐具接口
     *
     * @Param Type
     * Tableware object
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    void setTableware(Tableware tableware);
}
