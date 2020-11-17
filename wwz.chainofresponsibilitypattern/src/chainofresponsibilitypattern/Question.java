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

    public Question(String question) {
        PrintTool.print("Can you help me? I want to know "+question);
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }
}
