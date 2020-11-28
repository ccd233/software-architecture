package builderpattern;

import tools.PrintTool;

/**
 * @Author Nie Yixin
 * @Description: This class is a director for creating a specific meal
 * @Date: Created in 13:22 2020/11/13
 * @Modified By:
 **/
public class MealDirector {
    /***
     * @Author: Nie Yixin
     * @Description: 创建一份儿童餐
     *
     * @Param Type
     * Builder object
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public void constructChildMeal(Builder builder) {
        PrintTool.print("Cooking chilren meal for you...");
        builder.setMainCourse(new MainCourse("Splicy Chicken Filet Burger","Hamburger","Hot"));
        builder.setDrinks(new Drink("Cola","Sodas","Ice"));
        builder.setPrice(100);
        builder.setTableware(new Tableware("Straw"));
    }
    /***
     * @Author: Nie Yixin
     * @Description: 创建一份成人餐（男）
     *
     * @Param Type
     * Builder object
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public void constructManMeal(Builder builder) {
        PrintTool.print("Cooking man meal for you...");
        builder.setMainCourse(new MainCourse("Filet Steak","Steak","Medium Well"));
        builder.setDrinks(new Drink("Red Wine","Wine","Ice"));
        builder.setPrice(200);
        builder.setTableware(new Tableware("Knives and forks and glass"));
    }
    /***
     * @Author: Nie Yixin
     * @Description: 创建一份成人餐（女）
     *
     * @Param Type
     * Builder object
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public void constructWomanMeal(Builder builder) {
        PrintTool.print("Cooking woman meal for you...");
        builder.setMainCourse(new MainCourse("Fruit salad","Salad","Sweet"));
        builder.setDrinks(new Drink("Red Wine","Wine","Ice"));
        builder.setPrice(200);
        builder.setTableware(new Tableware("Spoons and forks and glass"));
    }
}
