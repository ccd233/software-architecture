package facadetry;

import tools.PrintTool;

/**
 * @Author Shen Fangzhi
 * @Description: This class represents the light in a scene.
 * @Date: Created in 18:03 2020/11/6
 * @Modified By:
 **/
public class SceneLight {
    public SceneLight() {
    }

    /**
     * @Author: Shen Fangzhi
     * @Description:代表灯光打开
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 15:04 2020/11/19
     * @Modified By:
    **/
    public void lightOn() {
        System.out.println("The light is on.");
    }

    /**
     * @Author: Shen Fangzhi
     * @Description:代表灯光关闭
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 15:04 2020/11/19
     * @Modified By:
    **/
    public void lightOff() {
        System.out.println("The light is off.");
    }
}
