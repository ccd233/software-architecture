package delegationpattern;


import tools.PrintTool;

/**
 * @Author Nie Yixin
 * @Description: jump skill
 * @Date: Created in 19:10 2020/11/25
 * @Modified By:
 **/
public class Jump implements Skill{
    /***
     * @Author: Nie Yixin
     * @Description: 展示跳跃技能
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
        PrintTool.print("Jump in the air...");
    }
}
