package FacadeTry;

/**
 * @Author Shen Fangzhi
 * @Description: This class can be used to set up teh scene.
 * @Date: Created in 16:50 2020/11/6
 * @Modified By:
 **/
public class sceneDisplay {
    private Screen screen = new Screen();
    private sceneLight light = new sceneLight();
    private audioDevice audio;
    private videoDevice video;

    public sceneDisplay(String audioType, String videoType) {
        this.audio = new audioDevice(audioType);
        this.video = new videoDevice(videoType);
    }

    public void start() {
        screen.screenDown();
        light.lightOff();
        audio.audioOpen();
        video.videoOopen();
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
