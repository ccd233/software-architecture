package delegationpattern;

/**
 * @Author Nie Yixin
 * @Description: dolphin is born with the skill of jumping, and can handshake by learning
 * @Date: Created in 19:12 2020/11/25
 * @Modified By:
 **/
public class Dolphin {
    private Skill inbornSkill = new Jump();

    public void showSkill() {
        this.inbornSkill.showSkill();
    }

    public void learnSkill(Skill newSkill) {
        this.inbornSkill = newSkill;
    }
}
