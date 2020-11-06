package DecoratorTry;

/**
 * @Author Shen Fangzhi
 * @Description: A concrete Recreational activity.
 * @Date: Created in 19:42 2020/11/5
 * @Modified By:
 **/
public class balloonCarnival extends recreationalActivity {
    private int time;
    private int crowdSize;
    private String info;

    public balloonCarnival(int time, int crowdSize, String info) {
        this.time = time;
        this.crowdSize = crowdSize;
        this.info = info;
    }

    public int getTime() {
        return time;
    }

    public int getCrowdSize() {
        return crowdSize;
    }

    public String getInfo() {
        return info;
    }
}
