package delegationpattern;

/**
 * @Author Nie Yixin
 * @Description: dolphin is born with the skill of jumping, and can handshake by learning
 * @Date: Created in 19:12 2020/11/25
 * @Modified By:
 **/
public class Dolphin {
    private Skill inbornSkill = new Jump();
    /***
     * @Author: Nie Yixin
     * @Description: 展示技能，海豚天生就会jump
     *
     * @Param Type
     *
     *
     * @Return Value
     * @return:void
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public void showSkill() {
        this.inbornSkill.showSkill();
    }
    /***
     * @Author: Nie Yixin
     * @Description: 海豚后天学会握手，通过改变this.inbornSkill实现
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
    public void learnSkill(Skill newSkill) {
        this.inbornSkill = newSkill;
    }
}
