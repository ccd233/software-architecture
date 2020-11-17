package decoratortry;

/**
 * @Author Shen Fangzhi
 * @Description: A concrete Recreational activity.
 * @Date: Created in 19:42 2020/11/5
 * @Modified By:
 **/
public class BalloonCarnival extends RecreationalActivity {
    String elements=new String();
    private int time;
    private int crowdSize;
    private String info;

    public BalloonCarnival(int time, int crowdSize, String info) {
        this.time = time;
        this.crowdSize = crowdSize;
        this.info = info;
    }

    @Override
    public int getTime() {
        return time;
    }

    @Override
    public int getCrowdSize() {
        return crowdSize;
    }

    @Override
    public String getInfo() {
        return info;
    }

    @Override
    public String getElements() {
        return elements;
    }
}
