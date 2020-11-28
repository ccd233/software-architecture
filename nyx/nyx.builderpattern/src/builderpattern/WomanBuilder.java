package builderpattern;

/**
 * @Author Nie Yixin
 * @Description: woman builder implements builder
 * @Date: Created in 13:13 2020/11/13
 * @Modified By:
 **/
public class WomanBuilder implements Builder{
    private MainCourse mainCourse;
    private Drink drinks;
    private int price;
    private Tableware tableware;
    /***
     * @Author: Nie Yixin
     * @Description: set price
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
     * @Description: set main course
     *
     * @Param Type
     * Maincourse object
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
     * @Description: set drinks
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
     * @Description: set tableware
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
     * builderpattern.MainCourse object
     * builderpattern.Drink object
     * int
     * builderpattern.Tableware object
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
