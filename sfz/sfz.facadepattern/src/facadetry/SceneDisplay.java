package facadetry;

import tools.PrintTool;

/**
 * @Author Shen Fangzhi
 * @Description: This class can be used to set up teh scene.
 * @Date: Created in 16:50 2020/11/6
 * @Modified By:
 **/
public class SceneDisplay {
    private Screen screen = new Screen();
    private SceneLight light = new SceneLight();
    private AudioDevice audio;
    private VideoDevice video;

    public SceneDisplay(String audioType, String videoType) {
        this.audio = new AudioDevice(audioType);
        this.video = new VideoDevice(videoType);
    }

    /**
     * @Author: Shen Fangzhi
     * @Description:集成了一系列设备的启动操作形成的开始操作
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 15:01 2020/11/19
     * @Modified By:
    **/
    public void start() {
        PrintTool.print("The show is on!");
        screen.screenDown();
        light.lightOff();
        audio.audioOpen();
        video.videoOpen();
        System.out.println();
    }

    /**
     * @Author: Shen Fangzhi
     * @Description:集成了一系列设备的运行操作形成的运行操作
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 15:02 2020/11/19
     * @Modified By:
    **/
    public void play() {
        PrintTool.print("The show is playing now!");
        audio.audioPlay();
        video.videoPlay();
        System.out.println();
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 集成了一系列设备的停止操作形成的结束操作
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 15:03 2020/11/19
     * @Modified By:
    **/
    public void end() {
        PrintTool.print("The show is over.");
        audio.audioClosed();
        video.videoClosed();
        light.lightOn();
        screen.screenUp();
        System.out.println();
    }

}
