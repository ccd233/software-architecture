package chainofresponsibilitypattern;

import tools.PrintTool;

/**
 * @Author Wang Wenzheng
 * @Description:
 * @Date: Created in 21:19 2020/11/16
 * @Modified By:
 **/
public class FoodGuideMan extends GuideMan{
    public FoodGuideMan(String name) {
        super(name);
        PrintTool.print("I am normal guide "+name+"，I only know where you can eat food");
    }

    @Override
    public boolean solveQuestion(String question) {
        if (question.contains("food")) {
            PrintTool.print("I can solve \"" + question + "\"");
            return true;
        } else {
            PrintTool.print("I can not solve \"" + question + "\"");
            return false;
        }
    }
}
