package com.java.nyx.buildpattern;
/**
 * @Author Nie Yixin
 * @Description: This class is a director for creating a specific meal
 * @Date: Created in 13:22 2020/11/13
 * @Modified By:
 **/
public class MealDirector {
    public void constructChildMeal(Builder builder) {
        System.out.println("Cooking chilren meal for you...");
        builder.setMainCourse(new MainCourse("Splicy Chicken Filet Burger","Hamburger","Hot"));
        builder.setDrinks(new Drink("Cola","Sodas","Ice"));
        builder.setPrice(100);
        builder.setTableware(new Tableware("Straw"));
    }
    public void constructManMeal(Builder builder) {
        System.out.println("Cooking man meal for you...");
        builder.setMainCourse(new MainCourse("Filet Steak","Steak","Medium Well"));
        builder.setDrinks(new Drink("Red Wine","Wine","Ice"));
        builder.setPrice(200);
        builder.setTableware(new Tableware("Knives and forks and glass"));
    }
    public void constructWomanMeal(Builder builder) {
        System.out.println("Cooking woman meal for you...");
        builder.setMainCourse(new MainCourse("Fruit salad","Salad","Sweet"));
        builder.setDrinks(new Drink("Red Wine","Wine","Ice"));
        builder.setPrice(200);
        builder.setTableware(new Tableware("Spoons and forks and glass"));
    }
}
