package delegationpattern;

/**
 * @Author Nie Yixin
 * @Description:
 * @Date: Created in 19:19 2020/11/25
 * @Modified By:
 **/
public class DelegationPattern {
    public static void delegationPattern(){
        Dolphin dolphin = new Dolphin();
        System.out.println("the dolphin is born with jumping:");
        dolphin.showSkill();
        Skill handshake = new Handshake();
        System.out.println("the dolphin can learn to handshake:");
        dolphin.learnSkill(handshake);
        dolphin.showSkill();
    }
}
