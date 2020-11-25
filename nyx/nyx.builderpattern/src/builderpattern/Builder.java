package builderpattern;

/**
 * @Author Nie Yixin
 * @Description:
 * @Date: Created in 13:01 2020/11/13
 * @Modified By:
 **/
public interface Builder {
    void setMainCourse(MainCourse mainCourse);
    void setDrinks(Drink drinks);
    void setPrice(int price);
    void setTableware(Tableware tableware);
}
