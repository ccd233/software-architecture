package chainofresponsibilitypattern;

import tools.PrintTool;

/**
 * @Author Wang Wenzheng
 * @Description:
 * @Date: Created in 18:23 2020/11/5
 * @Modified By:
 **/
public class UselessGuideMan extends GuideMan {

    public UselessGuideMan(String name) {
        super(name);
        PrintTool.print("I am idiot "+name+"，I can do nothing");
    }

    @Override
    public boolean solveQuestion(String question) {
        PrintTool.print("I can not answer \"" + question + "\"");
        return false;
    }
}
