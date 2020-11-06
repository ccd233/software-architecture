package DecoratorTry;

/**
 * @Author Shen Fangzhi
 * @Description: Forest theme
 * @Date: Created in 19:56 2020/11/5
 * @Modified By:
 **/
public class forest extends theme {
    public forest(recreationalActivity recreationalactivity) {
        super(recreationalactivity);
    }

    public int getTime() {
        return recreationalactivity.getTime();
    }

    public int getCrowdSize() {
        return recreationalactivity.getCrowdSize();
    }

    public String getInfo() {
        return recreationalactivity.getInfo() + "The theme of this carnival is forest!";
    }
}
