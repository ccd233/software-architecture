package chainofresponsibilitypattern;

import tools.PrintTool;

/**
 * @Author Wang Wenzheng
 * @Description: 一个不能解决任何问题的铁混子废物志愿者类
 * @Date: Created in 18:23 2020/11/5
 * @Modified By:
 **/
public class UselessGuideMan extends GuideMan {

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
    public UselessGuideMan(String name) {
        super(name);
        PrintTool.print("I am idiot "+name+"，I can do nothing");
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 铁混子废物志愿者不能解决问题，所以直接返回false
     *
     * @Param Type
     * param: question
     * resume: 表示问题的字符串
     *
     * @Return Value
     * @return: boolean
     * @resume: 直接返回false
     *
     * @Date: 21:19 2020/11/17
     * @Modified By:
    **/
    @Override
    public boolean solveQuestion(String question) {
        PrintTool.print("I can not answer \"" + question + "\"");
        return false;
    }
}
