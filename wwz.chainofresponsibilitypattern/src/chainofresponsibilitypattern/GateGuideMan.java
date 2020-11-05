package chainofresponsibilitypattern;

import tools.PrintTool;

/**
 * @Author Wang Wenzheng
 * @Description:
 * @Date: Created in 18:28 2020/11/5
 * @Modified By:
 **/
public class GateGuideMan extends GuideMan {
    public GateGuideMan(String name) {
        super(name);
    }

    @Override
    public boolean solveQuestion(String question) {
        if (question.contains("gate")) {
            PrintTool.print("I can solve \"" + question + "\"");
            return true;
        } else {
            PrintTool.print("I can not solve \"" + question + "\"");
            return false;
        }
    }
}
