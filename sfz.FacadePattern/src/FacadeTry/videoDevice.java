package FacadeTry;

/**
 * @Author Shen Fangzhi
 * @Description: This class represents devides used to play videp
 * @Date: Created in 17:24 2020/11/6
 * @Modified By:
 **/

//This class can be turned into abstract class and realize it in its subclass.
//Then this class will also implement the Template Method Model.

public class videoDevice {
    private String type;

    public videoDevice(String type) {
        this.type = type;
    }

    public void videoOopen() {
        System.out.println("The video device " + type + " has opened.");
    }

    public void videoClosed() {
        System.out.println("The video device " + type + " has closed.");
    }

    public void videoPlay() {
        System.out.println("The video device " + type + " is playing.");
    }
}
