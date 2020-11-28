package chainofresponsibilitypattern;

import tools.PrintTool;

/**
 * @Author Wang Wenzheng
 * @Description: 所有具体志愿者类的父类
 * @Date: Created in 18:19 2020/11/5
 * @Modified By:
 **/
public abstract class GuideMan{
    private final String name;
    private GuideMan nextGuideMan;
    /**
     * @Author: Wang Wenzheng
     * @Description: 构造函数
     *
     * @Param Type
     * param: name
     * resume: 向导名
     *
     * @Return Value
     * @return:
     * @resume:
     *
     * @Date: 18:22 2020/11/28
     * @Modified By:
     **/
    public GuideMan(String name){
        this.name=name;
    }

    public String getName(){return this.name;}

    /**
     * @Author: Wang Wenzheng
     * @Description: 尝试解决问题，如果当前志愿者可以解决，则结束。否则将问题交给下一个志愿者尝试解决
     *
     * @Param Type
     * param: question
     * resume: 表示问题的字符串
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 21:20 2020/11/17
     * @Modified By:
    **/
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

    /**
     * @Author: Wang Wenzheng
     * @Description: 一个抽象方法，每一个子类都需要根据自身特点实现不同的方法以表示解决不同类问题
     *
     * @Param Type
     * param: question
     * resume: 表示问题的字符串
     *
     * @Return Value
     * @return: boolean
     * @resume: 若能回答则返回true，否则返回false
     *
     * @Date: 21:21 2020/11/17
     * @Modified By:
    **/
    public abstract boolean solveQuestion(String question);

    /**
     * @Author: Wang Wenzheng
     * @Description: 形成责任链
     *
     * @Param Type
     * param: nextGuide
     * resume: 该责任链节点的下一个节点
     *
     * @Return Value
     * @return: chainofresponsibilitypattern.GuideMan
     * @resume: 返回下一个节点，可以用于连续调用该方法
     *
     * @Date: 21:17 2020/11/17
     * @Modified By:
    **/
    public GuideMan setNextGuide(GuideMan nextGuide) {
        this.nextGuideMan=nextGuide;
        return this.nextGuideMan;
    }

}
