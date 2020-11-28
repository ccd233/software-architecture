package chainofresponsibilitypattern;

import tools.PrintTool;

/**
 * @Author Wang Wenzheng
 * @Description: 代表问题的类
 * @Date: Created in 21:27 2020/11/16
 * @Modified By:
 **/
public class Question {
    private String question;

    /**
     * @Author: Wang Wenzheng
     * @Description:
     *
     * @Param Type
     * param: question
     * resume:
     *
     * @Return Value
     * @return:
     * @resume:
     *
     * @Date: 18:23 2020/11/28
     * @Modified By:
    **/
    public Question(String question) {
        PrintTool.print("Can you help me? I want to know "+question);
        this.question = question;
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 获取问题字符串
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: java.lang.String
     * @resume: 代表问题的字符串
     *
     * @Date: 18:23 2020/11/28
     * @Modified By:
    **/
    public String getQuestion() {
        return question;
    }
}
