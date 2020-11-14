package com.java.nyx.buildpattern;

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

    @Override
    public void setMainCourse(MainCourse mainCourse){
        this.mainCourse = mainCourse;
    }

    @Override
    public void setDrinks(Drink drinks) {
        this.drinks = drinks;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void setTableware(Tableware tableware) {
        this.tableware = tableware;
    }
    /**
     * @Author: Nie Yixin
     * @Description:
     *
     * @Param Type
     * MainCourse object,Drink object,int,Tableware object
     *
     * @Return Value
     * @return: Meal object
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public Meal getResult() {
        return new Meal(mainCourse,drinks,price,tableware);
    }
}
