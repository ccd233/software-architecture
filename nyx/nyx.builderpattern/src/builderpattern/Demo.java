package builderpattern;

import java.util.Scanner;

/**
 * @Author Nie Yixin
 * @Description:
 * @Date: Created in 14:50 2020/11/17
 * @Modified By:
 **/
public class Demo {
    public void buildPattern() {
        System.out.println("Here are three kinds meal for you:man(m),woman(w),children(c),exit(e)");
        MealDirector director = new MealDirector();
        while(true) {
            System.out.println("Choose your meal:");
            Scanner choiceInput = new Scanner(System.in);
            String choice = choiceInput.next();
            if (choice.equals("m")) {
                ManBuilder manBuilder = new ManBuilder();
                director.constructManMeal(manBuilder);
                Meal meal = manBuilder.getResult();
                System.out.println("Main course is " + meal.getMainCourse().name);
                System.out.println("Drinks is " + meal.getDrinks().name);
                System.out.println("The price is " + meal.getPrice());
                System.out.println("builderpattern.Tableware is " + meal.getTableware().name);
            } else if (choice.equals("w")) {
                WomanBuilder womanBuilder = new WomanBuilder();
                director.constructWomanMeal(womanBuilder);
                Meal meal = womanBuilder.getResult();
                System.out.println("Main course is " + meal.getMainCourse().name);
                System.out.println("Drinks is " + meal.getDrinks().name);
                System.out.println("The price is " + meal.getPrice());
                System.out.println("builderpattern.Tableware is " + meal.getTableware().name);
            } else if (choice.equals("c")) {
                ChildrenBuilder childrenBuilder = new ChildrenBuilder();
                director.constructChildMeal(childrenBuilder);
                Meal meal = childrenBuilder.getResult();
                System.out.println("Main course is " + meal.getMainCourse().name);
                System.out.println("Drinks is " + meal.getDrinks().name);
                System.out.println("The price is " + meal.getPrice());
                System.out.println("builderpattern.Tableware is " + meal.getTableware().name);
            } else if(choice.equals("e")){
                System.out.println("Exit!");
                break;
            } else {
                System.out.println("Wrong command!");
            }
        }
    }
}
