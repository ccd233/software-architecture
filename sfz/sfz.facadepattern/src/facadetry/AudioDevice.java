package facadetry;

import tools.PrintTool;

/**
 * @Author Shen Fangzhi
 * @Description: This class represents devices used to play audio.
 * @Date: Created in 16:57 2020/11/6
 * @Modified By:
 **/

//This class can be turned into abstract class and realize it in its subclass.
//Then this class will also implement the Template Method Model.

public class AudioDevice {
    private String type;

    public AudioDevice(String type) {
        this.type = type;
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 打开音频设备操作
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 16:02 2020/11/19
     * @Modified By:
    **/
    public void audioOpen() {
        System.out.println("The audio device " + type + " has opened.");
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 关闭音频设备操作
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 16:02 2020/11/19
     * @Modified By:
    **/
    public void audioClosed() {
        System.out.println("The audio device " + type + " has closed.");
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 播放音频设备操作
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 16:02 2020/11/19
     * @Modified By:
    **/
    public void audioPlay() {
        System.out.println("The audio device " + type + " is playing.");
    }
}
