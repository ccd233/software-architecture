package facadetry;

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

    public void start() {
        screen.screenDown();
        light.lightOff();
        audio.audioOpen();
        video.videoOpen();
        System.out.println("");
    }

    public void play() {
        audio.audioPlay();
        video.videoPlay();
        System.out.println("");
    }

    public void end() {
        audio.audioClosed();
        video.videoClosed();
        light.lightOn();
        screen.screenUp();
        System.out.println("");

    }

}
