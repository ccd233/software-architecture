package chainofresponsibilitypattern;

import tools.PrintTool;

/**
 * @Author Wang Wenzheng
 * @Description:
 * @Date: Created in 18:24 2020/11/5
 * @Modified By:
 **/
public class GoodGuideMan extends GuideMan {

    public GoodGuideMan(String name) {
        super(name);
    }

    @Override
    public boolean solveQuestion(String question) {
        PrintTool.print("I can solve \"" + question + "\"");
        return true;
    }
}
