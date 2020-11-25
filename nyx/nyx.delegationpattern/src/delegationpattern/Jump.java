package delegationpattern;


/**
 * @Author Nie Yixin
 * @Description: jump skill
 * @Date: Created in 19:10 2020/11/25
 * @Modified By:
 **/
public class Jump implements Skill{
    @Override
    public void showSkill() {
        System.out.println("Jump in the air...");
    }
}
