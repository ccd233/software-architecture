package decoratortry;

/**
 * @Author Shen Fangzhi
 * @Description: This is an abstract class to decorate a concrete activity.(element)
 * @Date: Created in 19:47 2020/11/5
 * @Modified By:
 **/
public abstract class AbstractElement extends AbstractRecreationalActivity {

    protected AbstractRecreationalActivity recreationalactivity;

    protected AbstractElement(AbstractRecreationalActivity recreationalactivity) {
        this.recreationalactivity = recreationalactivity;
    }
}
