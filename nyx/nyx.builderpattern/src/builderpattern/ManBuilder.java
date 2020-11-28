package builderpattern;

/**
 * @Author Nie Yixin
 * @Description: man builder implements builder
 * @Date: Created in 13:08 2020/11/13
 * @Modified By:
 **/
public class ManBuilder implements Builder{

    private MainCourse mainCourse;
    private Drink drinks;
    private int price;
    private Tableware tableware;

    /***
     * @Author: Nie Yixin
     * @Description: 确定价格
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
    @Override
    public void setPrice(int price) {
        this.price = price;
    }
    /***
     * @Author: Nie Yixin
     * @Description: 创建主餐
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
    @Override
    public void setMainCourse(MainCourse mainCourse) {
        this.mainCourse = mainCourse;
    }
    /***
     * @Author: Nie Yixin
     * @Description: 创建饮料
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
    @Override
    public void setDrinks(Drink drinks) {
        this.drinks = drinks;
    }
    /***
     * @Author: Nie Yixin
     * @Description: 创建餐具
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
    @Override
    public void setTableware(Tableware tableware) {
        this.tableware = tableware;
    }

    /***
     * @Author: Nie Yixin
     * @Description:
     *
     * @Param Type
     * builderpattern.MainCourse object,builderpattern.Drink object,int,builderpattern.Tableware object
     *
     * @Return Value
     * @return: builderpattern.Meal object
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public Meal getResult() {
        return new Meal(mainCourse,drinks,price,tableware);
    }
}
