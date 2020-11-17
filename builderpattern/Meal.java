package com.java.nyx.buildpattern;
/**
 * @Author Nie Yixin
 * @Description:
 * @Date: Created in 13:15 2020/11/13
 * @Modified By:
 **/
public class Meal {
    private MainCourse mainCourse;
    private Drink drinks;
    private int price;
    private final Tableware tableware;

    public Meal(MainCourse mainCourse,Drink drinks,int price,Tableware tableware) {
        this.mainCourse = mainCourse;
        this.drinks = drinks;
        this.price = price;
        this.tableware = tableware;
    }

    public int getPrice() {
        return price;
    }

    public Drink getDrinks() {
        return drinks;
    }

    public MainCourse getMainCourse() {
        return mainCourse;
    }

    public Tableware getTableware() {
        return tableware;
    }
}
