package chainofresponsibilitypattern;

import tools.PrintTool;

/**
 * @Author Wang Wenzheng
 * @Description:
 * @Date: Created in 18:19 2020/11/5
 * @Modified By:
 **/
public abstract class GuideMan{
    private final String name;
    private GuideMan nextGuideMan;
    public GuideMan(String name){
        this.name=name;
    }

    public String getName(){return this.name;}

    public void trySolveQuestion(String question){
        if(this.solveQuestion(question)){
            return;
        }else if(this.nextGuideMan!=null) {
            PrintTool.print("let "+this.nextGuideMan.getName()+" to help you");
            this.nextGuideMan.trySolveQuestion(question);
        }else {
            PrintTool.print("No one can solve the question");
        }
    }

    public abstract boolean solveQuestion(String question);

    public GuideMan setNextGuide(GuideMan nextGuide) {
        this.nextGuideMan=nextGuide;
        return this.nextGuideMan;
    }

}
