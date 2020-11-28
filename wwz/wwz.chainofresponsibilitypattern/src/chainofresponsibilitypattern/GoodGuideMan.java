package chainofresponsibilitypattern;

import tools.PrintTool;

/**
 * @Author Wang Wenzheng
 * @Description:一个可以解决任何问题的大佬志愿者类
 * @Date: Created in 18:24 2020/11/5
 * @Modified By:
 **/
public class GoodGuideMan extends GuideMan {

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
    public GoodGuideMan(String name) {
        super(name);
        PrintTool.print("I am mogul "+name+"，I can solve anything");
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 大佬志愿者一定能解决问题，所以直接返回true
     *
     * @Param Type
     * param: question
     * resume: 表示问题的字符串
     *
     * @Return Value
     * @return: boolean
     * @resume: 能解决任何问题，所以一定返回true
     *
     * @Date: 21:15 2020/11/17
     * @Modified By:
    **/
    @Override
    public boolean solveQuestion(String question) {
        PrintTool.print("I can answer \"" + question + "\"");
        return true;
    }
}
