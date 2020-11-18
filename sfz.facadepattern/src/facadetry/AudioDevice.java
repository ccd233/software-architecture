package facadetry;

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

    public void audioOpen() {
        System.out.println("The audio device " + type + " has opened.");
    }

    public void audioClosed() {
        System.out.println("The audio device " + type + " has closed.");
    }

    public void audioPlay() {
        System.out.println("The audio device " + type + " is playing.");
    }
}
