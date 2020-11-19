package facadetry;

import tools.PrintTool;

/**
 * @Author Shen Fangzhi
 * @Description: This class represents devides used to play videp
 * @Date: Created in 17:24 2020/11/6
 * @Modified By:
 **/

//This class can be turned into abstract class and realize it in its subclass.
//Then this class will also implement the Template Method Model.

public class VideoDevice {
    private String type;

    public VideoDevice(String type) {
        this.type = type;
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 打开视频设备操作
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 16:05 2020/11/19
     * @Modified By:
    **/
    public void videoOpen() {
        System.out.println("The video device " + type + " has opened.");
    }

    /**
     * @Author: Shen Fangzhi
     * @Description:关闭视频设备操作
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 16:05 2020/11/19
     * @Modified By:
    **/
    public void videoClosed() {
        System.out.println("The video device " + type + " has closed.");
    }

    /**
     * @Author: Shen Fangzhi
     * @Description:播放视频设备操作
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 16:05 2020/11/19
     * @Modified By:
    **/
    public void videoPlay() {
        System.out.println("The video device " + type + " is playing.");
    }
}
