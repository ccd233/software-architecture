package delegationpattern;

import tools.PrintTool;

/**
 * @Author Nie Yixin
 * @Description: 展示了海豚先天的跳跃技能和通过学习后的握手技能
 * @Date: Created in 19:19 2020/11/25
 * @Modified By:
 **/
public class DelegationPattern {
    public static void delegationPattern(){
        Dolphin dolphin = new Dolphin();
        PrintTool.print("the dolphin is born with jumping:");
        dolphin.showSkill();
        Skill handshake = new Handshake();
        PrintTool.print("the dolphin can learn to handshake:");
        dolphin.learnSkill(handshake);
        dolphin.showSkill();
    }
}
