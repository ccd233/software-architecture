package DecoratorTry;

/**
 * @Author Shen Fangzhi
 * @Description: This is an abstract class to decorate a concrete activity.(Theme)
 * @Date: Created in 19:47 2020/11/5
 * @Modified By:
 **/
public abstract class theme extends recreationalActivity {
    protected recreationalActivity recreationalactivity;

    protected theme(recreationalActivity recreationalactivity) {
        this.recreationalactivity = recreationalactivity;
    }
}
