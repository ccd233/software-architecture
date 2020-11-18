package decoratortry;

/**
 * @Author Shen Fangzhi
 * @Description: This is an abstract class to decorate a concrete activity.(element)
 * @Date: Created in 19:47 2020/11/5
 * @Modified By:
 **/
public abstract class Element extends RecreationalActivity {
    protected RecreationalActivity recreationalactivity;

    protected Element(RecreationalActivity recreationalactivity) {
        this.recreationalactivity = recreationalactivity;
    }
}
