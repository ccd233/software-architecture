package chainofresponsibilitypattern;

/**
 * @Author Wang Wenzheng
 * @Description:
 * @Date: Created in 18:30 2020/11/5
 * @Modified By:
 **/
public class Main {
    public static void main(String[] args) {
        GuideMan tom=new UselessGuideMan("Tom");
        GuideMan bob=new GateGuideMan("Bob");
        GuideMan dick=new GoodGuideMan("Dick");
        //形成责任链
        tom.setNextGuide(bob).setNextGuide(dick);

        String question="Where is the aaa?";
        tom.trySolveQuestion(question);

    }
}
