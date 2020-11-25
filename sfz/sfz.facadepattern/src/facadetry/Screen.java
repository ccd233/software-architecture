package facadetry;

import tools.PrintTool;

/**
 * @Author Shen Fangzhi
 * @Description: This class represents the screen to display the video.
 * @Date: Created in 17:29 2020/11/6
 * @Modified By:
 **/
public class Screen {
    public Screen() {
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 代表升起屏幕操作
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 15:19 2020/11/19
     * @Modified By:
    **/
    public void screenUp() {
        System.out.println("The screen is lifting.");
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 代表降下屏幕操作
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 15:19 2020/11/19
     * @Modified By:
    **/
    public void screenDown() {
        System.out.println("The screen is dropping.");
    }
}
