package delegationpattern;

/**
 * @Author Nie Yixin
 * @Description: handshake skill
 * @Date: Created in 19:11 2020/11/25
 * @Modified By:
 **/
public class Handshake implements Skill{
    @Override
    public void showSkill() {
        System.out.println("Handshake with the trainer...");
    }
}
