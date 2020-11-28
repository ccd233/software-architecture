package builderpattern;

import tools.PrintTool;

import java.util.Scanner;

/**
 * @Author Nie Yixin
 * @Description: 通过输出交互展示Meal builder
 * @Date: Created in 14:50 2020/11/17
 * @Modified By:
 **/
public class Demo {
    public void buildPattern() {
        PrintTool.print("Here are three kinds meal for you:man(m),woman(w),children(c),exit(e)");
        MealDirector director = new MealDirector();
        while(true) {
            PrintTool.print("Choose your meal:");
            Scanner choiceInput = new Scanner(System.in);
            String choice = choiceInput.next();
            if (choice.equals("m")) {
                ManBuilder manBuilder = new ManBuilder();
                director.constructManMeal(manBuilder);
                Meal meal = manBuilder.getResult();
                PrintTool.print("Main course is " + meal.getMainCourse().name);
                PrintTool.print("Drinks is " + meal.getDrinks().name);
                PrintTool.print("The price is " + meal.getPrice());
                PrintTool.print("builderpattern.Tableware is " + meal.getTableware().name);
            } else if (choice.equals("w")) {
                WomanBuilder womanBuilder = new WomanBuilder();
                director.constructWomanMeal(womanBuilder);
                Meal meal = womanBuilder.getResult();
                PrintTool.print("Main course is " + meal.getMainCourse().name);
                PrintTool.print("Drinks is " + meal.getDrinks().name);
                PrintTool.print("The price is " + meal.getPrice());
                PrintTool.print("builderpattern.Tableware is " + meal.getTableware().name);
            } else if (choice.equals("c")) {
                ChildrenBuilder childrenBuilder = new ChildrenBuilder();
                director.constructChildMeal(childrenBuilder);
                Meal meal = childrenBuilder.getResult();
                PrintTool.print("Main course is " + meal.getMainCourse().name);
                PrintTool.print("Drinks is " + meal.getDrinks().name);
                PrintTool.print("The price is " + meal.getPrice());
                PrintTool.print("builderpattern.Tableware is " + meal.getTableware().name);
            } else if(choice.equals("e")){
                PrintTool.print("Exit!");
                break;
            } else {
                PrintTool.print("Wrong command!");
            }
        }
    }
}
