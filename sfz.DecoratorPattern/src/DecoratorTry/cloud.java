package decoratortry;

/**
 * @Author Shen Fangzhi
 * @Description: Cloud theme
 * @Date: Created in 19:56 2020/11/5
 * @Modified By:
 **/
public class Cloud extends Element {
    public Cloud(RecreationalActivity recreationalactivity) {
        super(recreationalactivity);
    }

    @Override
    public int getTime() {
        return recreationalactivity.getTime();
    }

    @Override
    public int getCrowdSize() {
        return recreationalactivity.getCrowdSize();
    }

    @Override
    public String getInfo() {
        return recreationalactivity.getInfo();
    }

    @Override
    public String getElements() {
        return recreationalactivity.getElements() + " cloud";
    }
}
