package com.java.nyx.buildpattern;

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

    @Override
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public void setMainCourse(MainCourse mainCourse) {
        this.mainCourse = mainCourse;
    }

    @Override
    public void setDrinks(Drink drinks) {
        this.drinks = drinks;
    }

    @Override
    public void setTableware(Tableware tableware) {
        this.tableware = tableware;
    }
    public Meal getResult() {

        return new Meal(mainCourse,drinks,price,tableware);
    }
}
