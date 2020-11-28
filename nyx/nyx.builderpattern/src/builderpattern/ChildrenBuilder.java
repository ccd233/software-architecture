package builderpattern;

/**
 * @Author Nie Yixin
 * @Description: children builder implements builder
 * @Date: Created in 13:03 2020/11/13
 * @Modified By:
 **/
public class ChildrenBuilder implements Builder{
    private MainCourse mainCourse;
    private Drink drinks;
    private int price;
    private Tableware tableware;

    /***
     * @Author: Nie Yixin
     * @Description: setMainCourse
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
    public void setMainCourse(MainCourse mainCourse){
        this.mainCourse = mainCourse;
    }
    /***
     * @Author: Nie Yixin
     * @Description: setDrinks
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
     * @Description: setPrice
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
     * @Description: setTableware
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
    /**
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
