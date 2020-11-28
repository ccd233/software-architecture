package builderpattern;

/**
 * @Author Nie Yixin
 * @Description: Meal实体类
 * @Date: Created in 13:15 2020/11/13
 * @Modified By:
 **/
public class Meal {
    private MainCourse mainCourse;
    private Drink drinks;
    private int price;
    private final Tableware tableware;

    public Meal(MainCourse mainCourse, Drink drinks, int price, Tableware tableware) {
        this.mainCourse = mainCourse;
        this.drinks = drinks;
        this.price = price;
        this.tableware = tableware;
    }
    /***
     * @Author: Nie Yixin
     * @Description: get price
     *
     * @Param Type
     *
     *
     * @Return Value
     * @return: int
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public int getPrice() {
        return price;
    }
    /***
     * @Author: Nie Yixin
     * @Description: get drinks
     *
     * @Param Type
     *
     *
     * @Return Value
     * @return: Drink object
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public Drink getDrinks() {
        return drinks;
    }
    /***
     * @Author: Nie Yixin
     * @Description: get main course
     *
     * @Param Type
     *
     *
     * @Return Value
     * @return: MainCourse object
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public MainCourse getMainCourse() {
        return mainCourse;
    }
    /***
     * @Author: Nie Yixin
     * @Description: get tableware
     *
     * @Param Type
     *
     *
     * @Return Value
     * @return: Tableware object
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public Tableware getTableware() {
        return tableware;
    }
}
