package delegationpattern;

import tools.PrintTool;

/**
 * @Author Nie Yixin
 * @Description: handshake skill
 * @Date: Created in 19:11 2020/11/25
 * @Modified By:
 **/
public class Handshake implements Skill{
    /***
     * @Author: Nie Yixin
     * @Description: 展示握手技能
     *
     * @Param Type
     *
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    @Override
    public void showSkill() {
        PrintTool.print("Handshake with the trainer...");
    }
}
