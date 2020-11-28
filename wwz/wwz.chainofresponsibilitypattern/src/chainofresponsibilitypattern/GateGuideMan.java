package chainofresponsibilitypattern;

import tools.PrintTool;

/**
 * @Author Wang Wenzheng
 * @Description:一个只能解决关于gate的问题的志愿者类
 * @Date: Created in 18:28 2020/11/5
 * @Modified By:
 **/
public class GateGuideMan extends GuideMan {
    private String questionType="gate";

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
    public GateGuideMan(String name) {
        super(name);
        PrintTool.print("I am normal guide "+name+"，I only know where the gate is");
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 判断自己是否能回答问题，并以布尔值返回结果
     *
     * @Param Type
     * param: question
     * resume: 表示问题的字符串
     *
     * @Return Value
     * @return: boolean
     * @resume: 若能回答则返回true，否则返回false
     *
     * @Date: 21:14 2020/11/17
     * @Modified By:
    **/
    @Override
    public boolean solveQuestion(String question) {
        if (question.contains(this.questionType)) {
            PrintTool.print("I can solve \"" + question + "\"");
            return true;
        } else {
            PrintTool.print("I can not solve \"" + question + "\"");
            return false;
        }
    }
}
