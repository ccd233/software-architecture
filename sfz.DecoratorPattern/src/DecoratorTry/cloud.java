package DecoratorTry;

/**
 * @Author Shen Fangzhi
 * @Description: Cloud theme
 * @Date: Created in 19:56 2020/11/5
 * @Modified By:
 **/
public class cloud extends theme {
    public cloud(recreationalActivity recreationalactivity) {
        super(recreationalactivity);
    }

    public int getTime() {
        return recreationalactivity.getTime();
    }

    public int getCrowdSize() {
        return recreationalactivity.getCrowdSize();
    }

    public String getInfo() {
        return recreationalactivity.getInfo() + " The theme of this carnival is Cloud!";
    }
}
